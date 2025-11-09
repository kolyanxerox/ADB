package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.core.view.PointerIconCompat;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class qa1 extends C1607gj {
    public static final /* synthetic */ int OooOo0 = 0;
    public final boolean OooOO0o;

    /* renamed from: OooOOO */
    public final boolean f23557OooOOO;

    /* renamed from: OooOOO0 */
    public final boolean f23558OooOOO0;

    /* renamed from: OooOOOO */
    public final boolean f23559OooOOOO;

    /* renamed from: OooOOOo */
    public final boolean f23560OooOOOo;

    /* renamed from: OooOOo */
    public final boolean f23561OooOOo;

    /* renamed from: OooOOo0 */
    public final boolean f23562OooOOo0;

    /* renamed from: OooOOoo */
    public final SparseArray f23563OooOOoo;

    /* renamed from: OooOo00 */
    public final SparseBooleanArray f23564OooOo00;

    static {
        new qa1(new pa1());
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
        Integer.toString(1007, 36);
        Integer.toString(1008, 36);
        Integer.toString(1009, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(PointerIconCompat.TYPE_NO_DROP, 36);
        Integer.toString(1013, 36);
        Integer.toString(1014, 36);
        Integer.toString(1015, 36);
        Integer.toString(1016, 36);
        Integer.toString(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 36);
        Integer.toString(1018, 36);
    }

    public qa1(pa1 pa1Var) {
        super(pa1Var);
        this.OooOO0o = pa1Var.OooOO0o;
        this.f23558OooOOO0 = pa1Var.f23261OooOOO0;
        this.f23557OooOOO = pa1Var.f23260OooOOO;
        this.f23559OooOOOO = pa1Var.f23262OooOOOO;
        this.f23560OooOOOo = pa1Var.f23263OooOOOo;
        this.f23562OooOOo0 = pa1Var.f23265OooOOo0;
        this.f23561OooOOo = pa1Var.f23264OooOOo;
        this.f23563OooOOoo = pa1Var.f23266OooOOoo;
        this.f23564OooOo00 = pa1Var.f23267OooOo00;
    }

    @Override // com.google.android.gms.internal.ads.C1607gj
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qa1.class == obj.getClass()) {
            qa1 qa1Var = (qa1) obj;
            if (super.equals(qa1Var) && this.OooOO0o == qa1Var.OooOO0o && this.f23558OooOOO0 == qa1Var.f23558OooOOO0 && this.f23557OooOOO == qa1Var.f23557OooOOO && this.f23559OooOOOO == qa1Var.f23559OooOOOO && this.f23560OooOOOo == qa1Var.f23560OooOOOo && this.f23562OooOOo0 == qa1Var.f23562OooOOo0 && this.f23561OooOOo == qa1Var.f23561OooOOo) {
                SparseBooleanArray sparseBooleanArray = this.f23564OooOo00;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = qa1Var.f23564OooOo00;
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.f23563OooOOoo;
                            int size2 = sparseArray.size();
                            SparseArray sparseArray2 = qa1Var.f23563OooOOoo;
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                ha1 ha1Var = (ha1) entry.getKey();
                                                if (!map2.containsKey(ha1Var) || !Objects.equals(entry.getValue(), map2.get(ha1Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.C1607gj
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.OooOO0o ? 1 : 0)) * 961) + (this.f23558OooOOO0 ? 1 : 0)) * 961) + (this.f23557OooOOO ? 1 : 0)) * 28629151) + (this.f23559OooOOOO ? 1 : 0)) * 31) + (this.f23560OooOOOo ? 1 : 0)) * 31) + (this.f23562OooOOo0 ? 1 : 0)) * 961) + (this.f23561OooOOo ? 1 : 0)) * 31;
    }
}
