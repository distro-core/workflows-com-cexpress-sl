SUMMARY = "Machine Stub place holder"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://stub.txt"

S = "${WORKDIR}"

PV = "1"

do_install() {
	install -d ${D}${sysconfdir}
}

inherit allarch

FILES:${PN} = "${sysconfdir}/"
