package org.apache.tika.mime;

import com.ironsource.C3034d9;

/* loaded from: classes3.dex */
class Magic implements Clause, Comparable<Magic> {
    private final Clause clause;
    private final int priority;
    private final String string;
    private final MimeType type;

    public Magic(MimeType mimeType, int i, Clause clause) {
        this.type = mimeType;
        this.priority = i;
        this.clause = clause;
        this.string = C3034d9.i.f8177d + i + "/" + clause + C3034d9.i.f8179e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Magic) {
            Magic magic = (Magic) obj;
            if (this.type.equals(magic.type) && this.string.equals(magic.string)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.tika.mime.Clause
    public boolean eval(byte[] bArr) {
        return this.clause.eval(bArr);
    }

    public int getPriority() {
        return this.priority;
    }

    public MimeType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() ^ this.string.hashCode();
    }

    @Override // org.apache.tika.mime.Clause
    public int size() {
        return this.clause.size();
    }

    public String toString() {
        return this.string;
    }

    @Override // java.lang.Comparable
    public int compareTo(Magic magic) {
        int iCompareTo = magic.priority - this.priority;
        if (iCompareTo == 0) {
            iCompareTo = magic.size() - size();
        }
        if (iCompareTo == 0) {
            iCompareTo = magic.type.compareTo(this.type);
        }
        return iCompareTo == 0 ? magic.string.compareTo(this.string) : iCompareTo;
    }
}
