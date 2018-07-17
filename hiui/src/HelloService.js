export default class HelloService { 

    sayHello() { 
        return fetch('hello.json').
            then(r => r.json());
    }

}