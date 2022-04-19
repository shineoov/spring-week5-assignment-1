package com.codesoom.assignment.domain.users;

/**
 * 회원 수정 요청
 */
public interface UserUpdateRequest {

    String getEmail();

    String getName();

    String getPassword();
}