package day_04;

public class garbage_collection {

    /*  Memory or space.
            1.Heap Memory :- objects, instance variable.
            2.Stack memory :- local variable, methods call.
            3.MetaSpace :- class-level data, method,definition, static variable. 
        */


    /*  garbage collection works --
             1. Marking, 2.Sweeping, 3.compacting
    */

    /*  Common JVM GC
             1. Serial GC :- small, single threded app with low memory requirment 
             2. Parallel GC :- Background task, Batch jobs, Computional power.
    */              

     /* Object lifecycle and Memory Management.

            obj = null --> intentionally clearing refrences
     
     */        

    /*
        JVM Architecture
            1. Class Loader Subsystem --> 
                A. Loading, 
                B. Linking, 
                C. Initialization.
            2. Runtime data areas (JVM Memory) --> 
                A. Per-Thread Memory (Isolated) --> 
                    1. PC Register, 
                    2. JVM Stack, 
                    3. Native Method Stack
                B. Shared Memory (Global) -->
                    1. Heap, 
                    2.Method Area
            3. Exceution Engine -->
                A. Interpreter
                B. JIT(Just-In-Compiler)   --> use to overcome the slowness of interpreter
                C. GC
            4. Native Interface -->
                A. JNI(Java Native Interface) 
                B. Native Method Libraries   

    
    */

            
}
