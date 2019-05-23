package entity;

import java.util.List;

public class PageResult<T> {
    private long total;
    private List<T> rows;

    public PageResult() {
    }

    public PageResult(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return this.total;
    }

    public List<T> getRows() {
        return this.rows;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PageResult)) return false;
        final PageResult<?> other = (PageResult<?>) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getTotal() != other.getTotal()) return false;
        final Object this$rows = this.getRows();
        final Object other$rows = other.getRows();
        if (this$rows == null ? other$rows != null : !this$rows.equals(other$rows)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PageResult;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $total = this.getTotal();
        result = result * PRIME + (int) ($total >>> 32 ^ $total);
        final Object $rows = this.getRows();
        result = result * PRIME + ($rows == null ? 43 : $rows.hashCode());
        return result;
    }

    public String toString() {
        return "PageResult(total=" + this.getTotal() + ", rows=" + this.getRows() + ")";
    }
}
