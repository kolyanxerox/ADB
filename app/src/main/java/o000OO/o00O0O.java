package o000OO;

import OoooOOO.o0O00000;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class o00O0O {

    /* renamed from: OooO00o */
    public static final o0O00000 f30178OooO00o = new o0O00000(18);

    public static void OooO00o(Oooo.OooOo00 oooOo00) throws GeneralSecurityException {
        o00000oo.o000oOoO o000oooo2;
        ArrayList arrayList = new ArrayList();
        o0000OO.OooO00o oooO00o = o0000OO.OooO00o.f29381OooO0O0;
        Iterator it = ((ConcurrentHashMap) oooOo00.f13712OooOo0o).values().iterator();
        while (it.hasNext()) {
            for (o00000oo.oo000o oo000oVar : (List) it.next()) {
                int iOrdinal = oo000oVar.f29305OooO0Oo.ordinal();
                if (iOrdinal == 1) {
                    o000oooo2 = o00000oo.o000oOoO.f29288OooO0OO;
                } else if (iOrdinal == 2) {
                    o000oooo2 = o00000oo.o000oOoO.f29289OooO0Oo;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    o000oooo2 = o00000oo.o000oOoO.f29290OooO0o0;
                }
                String strSubstring = oo000oVar.f29308OooO0oO;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                arrayList.add(new o0000OO.OooO0O0(o000oooo2, oo000oVar.f29306OooO0o, strSubstring, oo000oVar.f29307OooO0o0.name()));
            }
        }
        o00000oo.oo000o oo000oVar2 = (o00000oo.oo000o) oooOo00.f13710OooOo;
        Integer numValueOf = oo000oVar2 != null ? Integer.valueOf(oo000oVar2.f29306OooO0o) : null;
        if (numValueOf != null) {
            try {
                int iIntValue = numValueOf.intValue();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((o0000OO.OooO0O0) obj).f29384OooO0O0 == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
        Collections.unmodifiableList(arrayList);
    }
}
