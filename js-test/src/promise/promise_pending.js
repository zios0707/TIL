const dataCatcher = () => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            if (false) reject("이게 왜 됨?")
        }, 1000)
    })
}

let catched = false

dataCatcher()
    .then((data) => {
        console.log("good")
        console.log(data)
        catched = true
    })
    .catch((err) => {
        console.log("bad")
        console.log(err)
    })
    .finally(() => {
        if (!catched) console.log("아니 응답이 없는데?")
    })

/*
    dataCatcher() ->
    Promise 의 반환이 없으므로 pending 상태임. 즉 아래 then catch finally 는 이벤트 루프로 가지 않음 ->
    이벤트 루프에 실린게 없음 ->
    프로세스 종료 
 */