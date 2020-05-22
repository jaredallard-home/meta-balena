DESCRIPTION = "resin NTP configuration"
SECTION = "console/utils"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${RESIN_COREBASE}/COPYING.Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

SRC_URI = " \
    file://resin-ntp-config \
    "

S = "${WORKDIR}"

inherit allarch

RDEPENDS_${PN} = "chrony chronyc glibc-utils"

do_install() {
    install -d ${D}${bindir}
    install -m 0775 ${WORKDIR}/resin-ntp-config ${D}${bindir}/resin-ntp-config
}
