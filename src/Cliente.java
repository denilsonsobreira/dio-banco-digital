import lombok.Data;

@Data
public class Cliente {
    public Cliente(String nome) {
        this.nome = nome;
    }

    private String nome;
}
