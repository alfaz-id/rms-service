package id.alfaz.rms.model.response.occupation;

import id.alfaz.rms.helper.base.BasePaginationResponse;
import id.alfaz.rms.helper.model.Pagination;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetListOccupationResponse extends BasePaginationResponse {
    private Set<OccupationResponse> content;
    private Pagination pagination;
}
