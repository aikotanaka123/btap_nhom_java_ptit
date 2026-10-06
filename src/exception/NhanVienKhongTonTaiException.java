package exception;

/**
 * Ngoại lệ kiểm tra (checked exception - kế thừa Exception):
 * nơi gọi bắt buộc phải try-catch hoặc khai báo throws.
 * Ném ra khi tìm nhân viên theo mã mà không có.
 *
 * Người phụ trách: Đỗ Quang Trung - N24DCAT084
 */
public class NhanVienKhongTonTaiException extends Exception {

    private static final long serialVersionUID = 1L;

    private final String maNV;

    public NhanVienKhongTonTaiException(String maNV) {
        super("Không tìm thấy nhân viên có mã: " + maNV);
        this.maNV = maNV;
    }

    public String getMaNV() {
        return maNV;
    }
}
