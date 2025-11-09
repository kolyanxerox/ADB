package org.apache.tika.mime;

import OooO0oO.OooOo;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
class MinShouldMatchClause implements Clause {
    private final List<Clause> clauses;
    private final int min;

    public MinShouldMatchClause(int i, List<Clause> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("clauses must be not null with size > 0");
        }
        if (i > list.size()) {
            throw new IllegalArgumentException(OooOo.OooO("min (", i, ") cannot be > clauses.size (", list.size(), ")"));
        }
        if (i <= 0) {
            throw new IllegalArgumentException(OooOo.OooO0o(i, "min cannot be <= 0: "));
        }
        this.min = i;
        this.clauses = list;
    }

    @Override // org.apache.tika.mime.Clause
    public boolean eval(byte[] bArr) {
        Iterator<Clause> it = this.clauses.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().eval(bArr) && (i = i + 1) >= this.min) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.tika.mime.Clause
    public int size() {
        Iterator<Clause> it = this.clauses.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().size());
        }
        return iMax;
    }

    public String toString() {
        return "minShouldMatch (min: " + this.min + ") " + this.clauses;
    }
}
