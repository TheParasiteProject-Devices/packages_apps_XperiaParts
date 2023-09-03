PRODUCT_SOONG_NAMESPACES += \
    packages/apps/XperiaParts/packages

# Inherit from DeviceSettings config
$(call inherit-product, packages/apps/XperiaParts/configs/devicesettings.mk)

# Sepolicy
SYSTEM_EXT_PRIVATE_SEPOLICY_DIRS += packages/apps/XperiaParts/sepolicy/private
SYSTEM_EXT_PUBLIC_SEPOLICY_DIRS += packages/apps/XperiaParts/sepolicy/public
BOARD_VENDOR_SEPOLICY_DIRS += packages/apps/XperiaParts/sepolicy/vendor
