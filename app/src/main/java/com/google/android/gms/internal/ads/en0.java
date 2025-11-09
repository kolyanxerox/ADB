package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class en0 extends fn0 implements Serializable {

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f18632OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public static final en0 f18631OooOo0o = new en0(0);

    /* renamed from: OooOo, reason: collision with root package name */
    public static final en0 f18630OooOo = new en0(1);

    public /* synthetic */ en0(int i) {
        this.f18632OooOo0O = i;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f18632OooOo0O) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f18632OooOo0O) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
