package id.alfaz.rms.model.request.province;

import id.alfaz.rms.helper.base.BaseRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProvinceRequest extends BaseRequest {
    @NotEmpty
    @Size(max = 10)
    private String provinceCode;
    @NotEmpty
    @Size(max = 3)
    private String countryCode;
    @NotEmpty
    @Size(max = 60)
    private String provinceName;
    @NotEmpty
    @Size(max = 1)
    private String active;
}
