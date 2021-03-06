package id.alfaz.rms.model.response.uom;

import id.alfaz.rms.helper.base.BaseResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UomResponse extends BaseResponse {
    private String uomId;
    private String uomName;
    private String outletId;
    private String remark;
    private String active;
}
