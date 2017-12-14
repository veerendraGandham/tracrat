package com.mk.tracrat.dao;

import com.mk.tracrat.dto.AddressDto;
import com.mk.tracrat.dto.UserDto;
import com.mk.tracrat.dto.UserPermissionDto;
import com.mk.tracrat.dto.UserRoleDto;

public interface UserDao {

	public int userInsert(UserDto dto);

	public int userAddress(AddressDto dto);

	public int userRole(UserRoleDto dto);

	public int userPermission(UserPermissionDto dto);

}
