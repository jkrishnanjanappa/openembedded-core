SECTION = "x11/libs"
PRIORITY = "optional"
LICENSE = "BSD-X"

DEPENDS = "xproto-native util-macros-native"

SRC_URI = "${XORG_MIRROR}/X11R7.0/src/lib/libXdmcp-${PV}.tar.bz2"
S = "${WORKDIR}/libXdmcp-${PV}"

inherit native autotools pkgconfig
