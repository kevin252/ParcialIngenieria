/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Usuario;

/**
 *
 * @author kvin2
 */
public class CtlUsuario {

    private ArrayList<Usuario> usuarios;

    public CtlUsuario() {
        usuarios = new ArrayList<>();
    }

    public String LogIn(String usuario, String password) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getUsuario().equals(usuario)
                    && usuarios.get(i).getPassword().equals(password)) {
                return "Autenticado";
            } else {
                return "No existe el usuario";
            }
        }
         return "No existe el usuario";
    }

    public boolean crearUsuario(String usuario, String password) {
        usuarios.add(new Usuario(usuario, password));
        return true;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}
