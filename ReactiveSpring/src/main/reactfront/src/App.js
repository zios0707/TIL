import "./App.css";
import {useState} from "react";

function App() {

    //let [name, setName] = useState('Kang_hyunwook');
    //setName(Namgung_hyunwook); 이게 name = "Namgung_hyunwook"; 이랑 다를게 없다. 그것이 useState.

    /*let num = 1;

    function numUp() {
        num += 1;
        console.log(num)
    }
    * 이따구로 쓰면 정적으로 되어버림 = 아무리 버튼을 눌러도 화면상의 값은 증가하지 않음.
    */

    let [num, setNum] = useState(1);

    // 진짜 주의 점 여기서 setNum(2); 을 하면 페이지 무한 렌더 버그에 걸려서 개망하니까 주의

    setTimeout(() => {setNum(num += 1)}, 50);

    //이로써 알 수 있는 것은 일반 변수는 한번 렌더 되고 끝이지만
    //useState를 활용한 변수는 값이 바뀔 때 마다 새롭게 렌더 된다.
    //그러니까 로고, 네비게이션과 같은 부분은 일반 변수
    //새로 업데이트 되어야 하는 것들(간단히 예로 들자면 게시물?)은 useState를 쓰면 되는 부분이겠다.

  return (
    <div className="App">
      <header className="App-header">
        <div>{ num }</div>
          <button onClick={() => {setNum(num += 1)}}>버튼</button>
      </header>
    </div>
  );
}

export default App;
