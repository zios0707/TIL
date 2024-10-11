const promise = () =>
    new Promise( (resolve, reject) => {
        const answer = prompt("r u feel good or else?")

        if (typeof answer === "string" &&
            answer.toLowerCase().includes("good")) {
            resolve(true)
        }else {
            reject(false)
        }
    })

const loop = () => {
    promise().then((data) => {
        alert("I guess u r insane")
    }).catch((err) => {
        setTimeout(loop, 5)
    })
}

loop()

let value = 0;

setInterval(() => {
    const element = document.querySelector("h1")
    element.style.marginTop = `${++value}px`
}, 1)
