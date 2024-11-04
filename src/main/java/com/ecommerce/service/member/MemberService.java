package com.ecommerce.service.member;

import com.ecommerce.dto.ResponseDto;
import com.ecommerce.dto.member.MemberDto;
import com.ecommerce.dto.member.UpdateMemberDto;
import com.ecommerce.entity.Member;

public interface MemberService {

  MemberDto getMemberDetails(String memberId);

  MemberDto updateMember(String memberId, UpdateMemberDto request);

  ResponseDto deleteMember(String memberId);

  Member getMemberByMemberId(String memberId);

}
