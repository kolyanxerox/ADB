package androidx.work;

import androidx.work.Data;
import kotlin.jvm.internal.OooOo;
import oo00o.OooOO0;

/* loaded from: classes.dex */
public final class DataKt {
    public static final <T> boolean hasKeyWithValueOfType(Data data, String key) {
        OooOo.OooO0o0(data, "<this>");
        OooOo.OooO0o0(key, "key");
        OooOo.OooOO0O();
        throw null;
    }

    public static final Data workDataOf(OooOO0... pairs) throws Throwable {
        OooOo.OooO0o0(pairs, "pairs");
        Data.Builder builder = new Data.Builder();
        int length = pairs.length;
        int i = 0;
        while (i < length) {
            OooOO0 oooOO0 = pairs[i];
            i++;
            builder.put((String) oooOO0.f33185OooOo0O, oooOO0.f33186OooOo0o);
        }
        Data dataBuild = builder.build();
        OooOo.OooO0Oo(dataBuild, "dataBuilder.build()");
        return dataBuild;
    }
}
