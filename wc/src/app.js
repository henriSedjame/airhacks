class InnCitizen extends HTMLElement {

    constructor() { 
        super();
        this.root = this.attachShadow({mode: 'open'});
        this.amount = 42;
    }

    connectedCallback() { 
        this.root.innerHTML = `
            <style>
            h1{
                background: var(--dvt-background,red);
            }
            </style>
            <h1>The number is: ${this.getAttribute('priority')}</h1>
            <h2>The amount is ${this.amount}</h2>
            <button>click</button>
        `;
    }

}

customElements.define('inn-citizen',InnCitizen);



