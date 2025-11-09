package o00OO0oo;

import androidx.datastore.preferences.protobuf.OooO00o;
import java.util.ArrayList;
import o00OO0OO.OooO0O0;

/* loaded from: classes3.dex */
public abstract class Oooo0 {

    /* renamed from: OooO00o */
    public static final o00OO0o.OooO[] f32069OooO00o = new o00OO0o.OooO[0];

    public static final void OooO00o(int i, int i2, o00OO0o.OooO descriptor) {
        kotlin.jvm.internal.OooOo.OooO0o0(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(descriptor.OooO0o0(i4));
            }
            i3 >>>= 1;
        }
        String serialName = descriptor.OooO0oo();
        kotlin.jvm.internal.OooOo.OooO0o0(serialName, "serialName");
        throw new OooO0O0(arrayList, arrayList.size() == 1 ? OooO00o.OooOOO(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", serialName, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + serialName + "', but they were missing", null);
    }
}
