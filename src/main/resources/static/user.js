function handleSubmit(event){
    event.preventDefault();

    const data = new FormData(event.target);
    const value = Object.fromEntries(data.entries());
    console.log({value});
}

const from = document.querySelector('from');
form.addEventListener('submit',handleSubmit);