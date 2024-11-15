package com.example.membership.dto;

import com.example.membership.constant.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class MemberShipDTO {

    private Long num;           // 회원읽기등을 볼 때 pk 값 가지고 있어야함
                                // 등록시에는 필요 없으니까 notnull 같은거 안씀

    @NotBlank(message = "이름은 꼭 작성해야 합니다.")
    @Size(min = 2, max = 10, message = "이름은 최소 2글자에서 10글자 이내로 작성해야 합니다.")
    private String name;        // 이름, 낫 블링크, 최소 : 2, 최대 : 10

    @NotBlank(message = "빈 문자, 공백은 허용하지 않습니다. 이메일을 꼭 작성해야 합니다.")
    @Size(max = 50, message = "이메일은 최대 50글자까지 입력 가능합니다.")
    @Email(message = "이메일 형식에 맞춰 작성해주세요.")
    private String email;       // 이메일, email, 최대 : 50, 메시지 : 최대 50글자 이내로 작성하여야 합니다.

    @NotBlank(message = "비밀번호는 꼭 작성해야 합니다.")
    @Size(min = 8, max = 16, message = "비밀번호는 최소 8에서 16자리 이내로 작성해야 합니다.")
    private String password;    // 비밀번호, 낫 블링크, 최소 : 8, 최대 16, 메시지 : 최소 8에서 최대 16글자 이내로 작성하여야 합니다.

    @NotBlank(message = "주소는 꼭 작성해야 합니다.")
    private String address;     // 주소, 낫 블링크

    // 권한
    private Role role;          // 이건 어차피 유저디테일서비스에서 직접 넣어줄꺼임, 필요에 따라서 어드민 가입페이지와
                                // 일반 유저 가입페이지가 분리될 수 있음.


}
