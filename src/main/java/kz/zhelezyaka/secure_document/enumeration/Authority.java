package kz.zhelezyaka.secure_document.enumeration;

import static kz.zhelezyaka.secure_document.constant.Constants.ADMIN_AUTHORITIES;
import static kz.zhelezyaka.secure_document.constant.Constants.MANAGER_AUTHORITIES;
import static kz.zhelezyaka.secure_document.constant.Constants.SUPER_ADMIN_AUTHORITIES;
import static kz.zhelezyaka.secure_document.constant.Constants.USER_AUTHORITIES;

public enum Authority {
    USER(USER_AUTHORITIES),
    ADMIN(ADMIN_AUTHORITIES),
    SUPER_ADMIN(SUPER_ADMIN_AUTHORITIES),
    MANAGER(MANAGER_AUTHORITIES);

    private final String value;

    Authority(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
