import "./App.css";
import {useState} from "react";

function App() {

    let [num, setNum] = useState(1);

    /*리액트 식 스타일 붙이기*/
  return (
    <div className="App">
      <header className="App-header">
          <div style={{color: "red"}}>{ num }</div>
        <div className="number">{ num }</div>
      </header>
    </div>
  );
}

export default App;
