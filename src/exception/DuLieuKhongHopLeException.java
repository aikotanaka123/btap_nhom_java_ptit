package exception;

/**
 * Ngoại lệ không kiểm tra (unchecked - kế thừa RuntimeException):
 * không bắt buộc try-catch. Dùng khi dữ liệu nghiệp vụ sai
 * (trùng mã nhân viên, số giờ tăng ca vượt quy định, ...).
 *
 * Người phụ trách: Đỗ Quang Trung - N24DCAT084
 */
public class DuLieuKhongHopLeException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DuLieuKhongHopLeException(String thongBao) {
        super(thongBao);
    }
}
