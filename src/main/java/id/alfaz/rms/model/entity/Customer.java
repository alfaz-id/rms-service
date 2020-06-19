package id.alfaz.rms.model.entity;

import id.alfaz.rms.helper.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Data
@Entity
@Builder
@Table(name = "customer")
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends BaseEntity {
    @Id
    @Column(name = "customer_id",length = 36,nullable = false)
    private String customerId;
    @Column(name ="first_name" ,length =30 ,nullable = false)
    private String firstName;
    @Column(name = "last_name",length =30 ,nullable =true )
    private String lastName;
    @Column(name = "nick_name",length =30 ,nullable =false )
    private String nickName;
    @Column(name = "phone_number",length = 15,nullable = false)
    private String phoneNumber;
    @Column(name = "email",length = 30,nullable = false)
    private String email;
    @Column(name = "country_id",length =36 ,nullable =false )
    private String countryId;
    @Column(name = "province_id",length = 36,nullable =true )
    private String provinceId;
    @Column(name = "district_id",length = 36 ,nullable =true )
    private String districtId;
    @Column(name = "sub_district_id",length = 36,nullable = true)
    private String subDistrictId;
    @Column(name = "village_id",length = 36 ,nullable = true)
    private String villageId;
    @Column(name = "city_id",length = 36,nullable = true)
    private String cityId;
    @Column(name = "postcode",length =5 ,nullable = true)
    private Integer postcode;
    @Column(name = "address" ,length = 250,nullable = false)
    private String address;
    @Column(name = "place_of_birth",length = 250,nullable = false)
    private String placeOfBirth;
    @Column(name = "birth_of_date")
    private Date birthOfDate;
    @Column(name = "sex",length =1 ,nullable = false)
    private String sex;
    @Column(name = "id_card_type",length = 1,nullable = false)
    private String idCardType;
    @Column(name = "id_card_number",length = 30,nullable = false)
    private String idCardNumber;
    @Column(name = "image",length = 1280,nullable = true)
    private String image;
    @Column(name = "outlet_id",length = 36,nullable = false)
    private String outletId;
    @Column(name = "active",length = 1,nullable = false)
    private String active;
}
