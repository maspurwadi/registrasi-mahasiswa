package id.ac.tazkia.registration.registrasimahasiswa.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data @Builder
public class TagihanRequest {
    private String jenisTagihan;
    private String debitur;
    private BigDecimal nilaiTagihan;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date tanggalJatuhTempo;
    private String keterangan;
}
