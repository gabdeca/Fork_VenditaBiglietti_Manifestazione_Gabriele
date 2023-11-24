package it.dedagroup.manifestazione.DTO.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManifestazioneRequest {
    private String nome;
    private Long idCategoria;
}
