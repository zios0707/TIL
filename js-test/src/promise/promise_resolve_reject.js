const yesOrNo = (condition) => {
    return new Promise((resolve, reject) => {
        if (typeof condition === "string" &&
        condition.toUpperCase() === "YES") return resolve("YESYESYESYES")
        else reject("NONONONONONO")
    })
}

const success = () => yesOrNo("yes")

const failed = () => yesOrNo("no")

// promise에서 value를 return 하면 data나 err로 반환됨
success().then((data) => {
        console.log(data) // YESYESYESYES
    }).catch((err) => {
        console.log(err + " 절대 안일어나지요")
    })

failed()
    .then((data) => {
        console.log(data + " 절대 안일어나지요")
    }).catch((err) => {
        console.log(err) // NONONONONONO
    }).finally((arg) => {
        console.log(arg ? "근데 arg가 존재하나?" : "finally는 then, catch에서 모두 작동 (유사 try-catch)")
    })

/*
    promise는 try-catch-finally 의 유사 형태를 가진 비동기 처리를 돕는 박싱 클래스?!


 */