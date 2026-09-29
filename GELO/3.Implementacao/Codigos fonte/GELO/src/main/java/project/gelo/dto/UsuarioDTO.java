package project.gelo.dto;

import project.gelo.model.Usuario;

public record UsuarioDTO(
        Integer id,
        String nome,
        String email,
        String senha) {

    public static UsuarioDTO from(Usuario usuario){
        return new UsuarioDTO(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getSenha());
    }
}
