package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ld0 {

    /* renamed from: OooO00o, reason: collision with root package name */
    public final int f20851OooO00o;

    /* renamed from: OooO0O0, reason: collision with root package name */
    public final int f20852OooO0O0;

    /* renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f20853OooO0OO;

    public ld0(int i, int i2, boolean z) {
        this.f20851OooO00o = i;
        this.f20852OooO0O0 = i2;
        this.f20853OooO0OO = z;
    }

    public static ArrayList OooO00o(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int iNextInt = 0;
            int iNextInt2 = 0;
            boolean zNextBoolean = false;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if ("width".equals(strNextName)) {
                    iNextInt = jsonReader.nextInt();
                } else if ("height".equals(strNextName)) {
                    iNextInt2 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(strNextName)) {
                    zNextBoolean = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new ld0(iNextInt, iNextInt2, zNextBoolean));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
