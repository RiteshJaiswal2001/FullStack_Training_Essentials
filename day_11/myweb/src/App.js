
import './App.css';
import { useState, useEffect} from 'react';

function App() {
  const [count, setCount] = useState(0)

  function display(num1, num2) {
    console.log(num1, num2);
  }
  let nums = "12345";
  display(...nums); 
  
  const obj = {

    increment: () => {
      console.log(count);
      
      setCount(count+1)
      
      console.log(count);
    }
     
  };
  
  
  return (
    <div className="App">
     
     <h1>counter {count}</h1>
      <button onClick={obj.increment}>Increment</button>
    </div>
  );
}

export default App;
