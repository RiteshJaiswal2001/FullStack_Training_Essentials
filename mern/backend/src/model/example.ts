// // Team 10 — Reports, Dashboards and Audit

// import { model, Schema } from "mongoose";

// // Report definition
// const reportDefinitionSchema = new Schema(
//   {
//     // ...baseFields,
//     name: String,
//     description: String,
//     ownerId: {
//       type: Schema.Types.ObjectId,
//       ref: "User",
//     },
//     dataset: {
//       type: String,
//       enum: ["TICKETS", "SLA", "CUSTOMERS", "AGENTS", "INCIDENTS", "KNOWLEDGE"],
//     },
//     fields: [String],
//     filters: [
//       {
//         field: String,
//         operator: String,
//         value: Schema.Types.Mixed,
//       },
//     ],
//     groupBy: [String],
//     sort: [
//       {
//         field: String,
//         direction: String,
//       },
//     ],
//     calculatedFields: [
//       {
//         name: String,
//         expression: String,
//       },
//     ],
//     visualization: {
//       type: {
//         type: String,
//         enum: ["TABLE", "BAR", "LINE", "PIE", "KPI"],
//       },
//       configuration: Schema.Types.Mixed,
//     },
//     visibility: {
//       type: String,
//       enum: ["PRIVATE", "TEAM", "PUBLIC"],
//       default: "PRIVATE",
//     },
//   },
//   // baseSchemaOptions,
// );
// export const ReportDefinitionModel = model(
//   "ReportDefinition",
//   reportDefinitionSchema,
// );
// // Audit log

// // Audit documents should never be updated or deleted from the application.

// const auditLogSchema = new Schema(
//   {
//     tenantId: {
//       type: Schema.Types.ObjectId,
//       ref: "Tenant",
//       required: true,
//       index: true,
//     },
//     actorUserId: {
//       type: Schema.Types.ObjectId,
//       ref: "User",
//     },
//     actorCustomerId: {
//       type: Schema.Types.ObjectId,
//       ref: "Customer",
//     },
//     action: {
//       type: String,
//       required: true,
//     },
//     entityType: {
//       type: String,
//       required: true,
//       index: true,
//     },
//     entityId: {
//       type: Schema.Types.ObjectId,
//       required: true,
//       index: true,
//     },
//     before: Schema.Types.Mixed,
//     after: Schema.Types.Mixed,
//     ipAddress: String,
//     userAgent: String,
//     source: String,
//     correlationId: String,
//     createdAt: {
//       type: Date,
//       default: Date.now,
//       immutable: true,
//     },
//   },
//   {
//     versionKey: false,
//   },
// );
// auditLogSchema.index({
//   tenantId: 1,
//   entityType: 1,
//   entityId: 1,
//   createdAt: -1,
// });
// auditLogSchema.index({
//   tenantId: 1,
//   actorUserId: 1,
//   createdAt: -1,
// });
// export const AuditLogModel = model("AuditLog", auditLogSchema);

// // Other Team 10 models:

// // reportSchedules
// // reportRuns
// // dashboardPreferences

// Team 1 — Authentication, Users, Roles and Support Teams
// User model
// src/modules/identity/models/user.model.ts
import { Schema, model } from "mongoose";
import {
  baseFields,
  baseSchemaOptions,
} from "../../../shared/database/base-fields.js";
const userSchema = new Schema(
  {
    ...baseFields,
    employeeCode: {
      type: String,
      trim: true,
    },
    firstName: {
      type: String,
      required: true,
      trim: true,
    },
    lastName: {
      type: String,
      required: true,
      trim: true,
    },
    email: {
      type: String,
      required: true,
      lowercase: true,
      trim: true,
    },
    phone: String,
    passwordHash: {
      type: String,
      select: false,
    },
    roleIds: [
      {
        type: Schema.Types.ObjectId,
        ref: "Role",
      },
    ],
    teamIds: [
      {
        type: Schema.Types.ObjectId,
        ref: "SupportTeam",
      },
    ],
    status: {
      type: String,
      enum: ["ACTIVE", "INACTIVE", "LOCKED", "INVITED"],
      default: "INVITED",
      index: true,
    },
    timezone: {
      type: String,
      default: "Asia/Kolkata",
    },
    locale: {
      type: String,
      default: "en-IN",
    },
    authenticationProvider: {
      type: String,
      enum: ["LOCAL", "GOOGLE", "MICROSOFT", "KEYCLOAK"],
      default: "LOCAL",
    },
    externalIdentityId: String,
    mfa: {
      enabled: {
        type: Boolean,
        default: false,
      },
      secretEncrypted: {
        type: String,
        select: false,
      },
      recoveryCodes: {
        type: [String],
        select: false,
      },
    },
    lastLoginAt: Date,
  },
  baseSchemaOptions,
);
userSchema.index(
  {
    tenantId: 1,
    email: 1,
  },
  {
    unique: true,
  },
);
export const UserModel = model("User", userSchema);
// Role model
const permissionSchema = new Schema(
  {
    module: {
      type: String,
      required: true,
    },
    actions: [
      {
        type: String,
        enum: ["CREATE", "READ", "UPDATE", "DELETE", "EXPORT", "APPROVE"],
      },
    ],
    dataScope: {
      type: String,
      enum: ["OWN", "TEAM", "DEPARTMENT", "ALL"],
      default: "OWN",
    },
    allowedFields: [String],
    deniedFields: [String],
  },
  {
    _id: false,
  },
);
const roleSchema = new Schema(
  {
    ...baseFields,
    name: {
      type: String,
      required: true,
    },
    code: {
      type: String,
      required: true,
      uppercase: true,
    },
    description: String,
    permissions: [permissionSchema],
    isSystemRole: {
      type: Boolean,
      default: false,
    },
    status: {
      type: String,
      enum: ["ACTIVE", "INACTIVE"],
      default: "ACTIVE",
    },
  },
  baseSchemaOptions,
);
roleSchema.index(
  {
    tenantId: 1,
    code: 1,
  },
  {
    unique: true,
  },
);
export const RoleModel = model("Role", roleSchema);
// Support team model
const supportTeamSchema = new Schema(
  {
    ...baseFields,
    name: {
      type: String,
      required: true,
    },
    code: {
      type: String,
      required: true,
      uppercase: true,
    },
    description: String,
    managerId: {
      type: Schema.Types.ObjectId,
      ref: "User",
    },
    memberIds: [
      {
        type: Schema.Types.ObjectId,
        ref: "User",
      },
    ],
    skills: [String],
    maximumTicketCapacity: {
      type: Number,
      default: 50,
    },
    emailAddress: String,
    status: {
      type: String,
      enum: ["ACTIVE", "INACTIVE"],
      default: "ACTIVE",
    },
  },
  baseSchemaOptions,
);
supportTeamSchema.index(
  {
    tenantId: 1,
    code: 1,
  },
  {
    unique: true,
  },
);
export const SupportTeamModel = model("SupportTeam", supportTeamSchema);
