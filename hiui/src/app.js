import HelloService from './HelloService.js';
class MainView { 

    constructor() { 
        this.service = new HelloService();
        this.code = document.querySelector("code");
        this.code.innerText = "duke";
        this.code.onclick = e => console.log(e);
        this.input = document.querySelector("input");
        this.input.onkeydown = e => this.oninput(e);
    }

    oninput(e) { 
        const result = this.service.sayHello();
        result.then(j => this.display(j));
        console.log(this.input.value);
    }

    display(j) { 
        const { amount } = j;
        console.log(amount);

    }
}

new MainView();



