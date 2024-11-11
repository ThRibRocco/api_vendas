import { useState } from 'react';
import './FormUser.css';
import './ListUser.js';
import { useParams } from 'react-router-dom';

function UpdateUser() {
    const {id} = useParams();
    const [email, setEmail] = useState('');
    const [password, setPassword] = useState('');
    const [cpf_cnpj, setCpfCnpj] = useState('');
    
    async function updateUser(){
        
        if(name=== "" || email==="" || password === "" || cpf_cnpj === ""){
            alert("Preencha todos os campos")
            return
        }
        
        // integrar com a vossa API

        let api = await fetch("http://localhost:8081/user/" + id,{
            method:"PUT",
            body:JSON.stringify({
                "name":name,
                "email":email,
                "password": password,
                "cpf_cnpj":cpf_cnpj,
                "is_active":1
            }),
            headers:{
                'Content-Type':'application/json'
            }
        })

        if(api.ok){
            window.location.href = '/list-user'
            return
        }

        alert("Erro ao fazer a atualização!!");

    }


    return (
        <div id='form'>
            <h2>Atualizar</h2><br />

            <label htmlFor='name'></label>
            <input type='text' id='name' name='name' placeholder='Nome' value={name} onChange={(e) => setNome(e.target.value)} /><br />

            <label htmlFor='email'></label>
            <input type='email' id='email' name='email' placeholder='E-mail' value={email} onChange={(e) => setEmail(e.target.value)} /><br />

            <label htmlFor='password'></label>
            <input type='password' id='senha' name='senha' placeholder='Senha' value={password} onChange={(e) => setPassword(e.target.value)} /><br />

            <label htmlFor='cpf_cnpj'></label>
            <input type='text' id='cpf' name='cpf' placeholder='CPF | CNPJ' value={cpf_cnpj} onChange={(e) => setCpfCnpj(e.target.value)} /><br />

            <input type='button' value='Atualizar' onClick={updateUser} />
        </div>
    );
}

export default UpdateUser;
