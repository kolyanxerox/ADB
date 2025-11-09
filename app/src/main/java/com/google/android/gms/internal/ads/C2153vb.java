package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.zzb;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.vb */
/* loaded from: classes2.dex */
public final class C2153vb implements InterfaceC2042sb {

    /* renamed from: OooOoO0, reason: collision with root package name */
    public static final Map f24942OooOoO0;

    /* renamed from: OooOo, reason: collision with root package name */
    public final C1847n1 f24943OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final zzb f24944OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public final C1973qg f24945OooOo0o;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        ArrayMap arrayMap = new ArrayMap(7);
        for (int i = 0; i < 7; i++) {
            arrayMap.put(strArr[i], numArr[i]);
        }
        f24942OooOoO0 = Collections.unmodifiableMap(arrayMap);
    }

    public C2153vb(zzb zzbVar, C1973qg c1973qg, C1847n1 c1847n1) {
        this.f24944OooOo0O = zzbVar;
        this.f24945OooOo0o = c1973qg;
        this.f24943OooOo = c1847n1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x042e A[Catch: all -> 0x01d2, TryCatch #0 {all -> 0x01d2, blocks: (B:90:0x01c7, B:92:0x01cb, B:93:0x01d0, B:97:0x01d5, B:99:0x01dd, B:100:0x01e2, B:102:0x01e4, B:104:0x01f0, B:105:0x01f5, B:107:0x01f7, B:109:0x01ff, B:110:0x0204, B:112:0x0206, B:114:0x0214, B:115:0x0225, B:117:0x0233, B:118:0x0244, B:120:0x0252, B:121:0x0263, B:123:0x0271, B:124:0x0282, B:126:0x0290, B:127:0x029e, B:129:0x02ac, B:130:0x02ae, B:132:0x02b2, B:134:0x02b6, B:136:0x02be, B:139:0x02c6, B:143:0x02eb, B:149:0x02fb, B:217:0x042e, B:218:0x0433, B:220:0x0435, B:222:0x0455, B:224:0x0459, B:226:0x0466, B:228:0x04a4, B:259:0x0560, B:266:0x0593, B:267:0x05ac, B:268:0x05ce, B:270:0x05d6, B:271:0x05e6, B:272:0x060e, B:275:0x0611, B:277:0x0631, B:278:0x0646, B:260:0x0567, B:261:0x056e, B:262:0x0577, B:263:0x057e, B:264:0x0584, B:265:0x058d, B:227:0x04a1, B:280:0x0648, B:281:0x064d, B:151:0x0305, B:153:0x0309, B:182:0x035f, B:183:0x0369, B:192:0x03bc, B:194:0x03c0, B:196:0x03c4, B:199:0x03cc, B:184:0x036d, B:185:0x0377, B:186:0x037e, B:187:0x038a, B:188:0x0392, B:189:0x03a5, B:190:0x03b2, B:200:0x03db, B:207:0x0409, B:213:0x0419, B:210:0x040f, B:212:0x0417, B:203:0x0400, B:205:0x0406, B:214:0x041e, B:215:0x0425, B:283:0x064f, B:284:0x0654, B:286:0x0656, B:287:0x065b), top: B:311:0x01c7, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0435 A[Catch: all -> 0x01d2, TryCatch #0 {all -> 0x01d2, blocks: (B:90:0x01c7, B:92:0x01cb, B:93:0x01d0, B:97:0x01d5, B:99:0x01dd, B:100:0x01e2, B:102:0x01e4, B:104:0x01f0, B:105:0x01f5, B:107:0x01f7, B:109:0x01ff, B:110:0x0204, B:112:0x0206, B:114:0x0214, B:115:0x0225, B:117:0x0233, B:118:0x0244, B:120:0x0252, B:121:0x0263, B:123:0x0271, B:124:0x0282, B:126:0x0290, B:127:0x029e, B:129:0x02ac, B:130:0x02ae, B:132:0x02b2, B:134:0x02b6, B:136:0x02be, B:139:0x02c6, B:143:0x02eb, B:149:0x02fb, B:217:0x042e, B:218:0x0433, B:220:0x0435, B:222:0x0455, B:224:0x0459, B:226:0x0466, B:228:0x04a4, B:259:0x0560, B:266:0x0593, B:267:0x05ac, B:268:0x05ce, B:270:0x05d6, B:271:0x05e6, B:272:0x060e, B:275:0x0611, B:277:0x0631, B:278:0x0646, B:260:0x0567, B:261:0x056e, B:262:0x0577, B:263:0x057e, B:264:0x0584, B:265:0x058d, B:227:0x04a1, B:280:0x0648, B:281:0x064d, B:151:0x0305, B:153:0x0309, B:182:0x035f, B:183:0x0369, B:192:0x03bc, B:194:0x03c0, B:196:0x03c4, B:199:0x03cc, B:184:0x036d, B:185:0x0377, B:186:0x037e, B:187:0x038a, B:188:0x0392, B:189:0x03a5, B:190:0x03b2, B:200:0x03db, B:207:0x0409, B:213:0x0419, B:210:0x040f, B:212:0x0417, B:203:0x0400, B:205:0x0406, B:214:0x041e, B:215:0x0425, B:283:0x064f, B:284:0x0654, B:286:0x0656, B:287:0x065b), top: B:311:0x01c7, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x054a  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2042sb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0o0(java.lang.Object r19, java.util.Map r20) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2153vb.OooO0o0(java.lang.Object, java.util.Map):void");
    }
}
