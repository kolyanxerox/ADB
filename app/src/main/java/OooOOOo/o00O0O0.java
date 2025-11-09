package OoooOOO;

import androidx.collection.ArrayMap;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class o00O0O0 extends oO0Oo0o0 {

    /* renamed from: OooOoO */
    public HashSet f14106OooOoO;

    /* renamed from: OooOoO0 */
    public String f14107OooOoO0;

    /* renamed from: OooOoOO */
    public ArrayMap f14108OooOoOO;

    /* renamed from: OooOoo */
    public Long f14109OooOoo;

    /* renamed from: OooOoo0 */
    public Long f14110OooOoo0;

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final java.util.ArrayList OooOOOO(java.lang.String r35, java.util.List r36, java.util.List r37, java.lang.Long r38, java.lang.Long r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 2803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOOO.o00O0O0.OooOOOO(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final oOO0O000 OooOOOo(Integer num) {
        if (this.f14108OooOoOO.containsKey(num)) {
            return (oOO0O000) this.f14108OooOoOO.get(num);
        }
        oOO0O000 ooo0o000 = new oOO0O000(this, this.f14107OooOoO0);
        this.f14108OooOoOO.put(num, ooo0o000);
        return ooo0o000;
    }

    @Override // OoooOOO.oO0Oo0o0
    public final void OooOOO() {
    }
}
