package com.unity3d.services.ads.gmascar.adapters;

import OooO0oO.OooOo;
import com.unity3d.scar.adapter.common.OooO;
import com.unity3d.scar.adapter.common.OooO00o;
import com.unity3d.scar.adapter.common.OooO0O0;
import com.unity3d.scar.adapter.common.OooO0OO;
import com.unity3d.services.ads.gmascar.finder.ScarAdapterVersion;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import java.lang.reflect.InvocationTargetException;
import o000ooo.o0000O00;
import o000oooO.o000O0O0;

/* loaded from: classes3.dex */
public class ScarAdapterFactory {

    /* renamed from: com.unity3d.services.ads.gmascar.adapters.ScarAdapterFactory$1 */
    public static /* synthetic */ class C42311 {

        /* renamed from: $SwitchMap$com$unity3d$services$ads$gmascar$finder$ScarAdapterVersion */
        static final /* synthetic */ int[] f13184x776ad9a7;

        static {
            int[] iArr = new int[ScarAdapterVersion.values().length];
            f13184x776ad9a7 = iArr;
            try {
                iArr[ScarAdapterVersion.V21.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13184x776ad9a7[ScarAdapterVersion.V23.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13184x776ad9a7[ScarAdapterVersion.NA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void reportAdapterFailure(ScarAdapterVersion scarAdapterVersion, OooO0OO oooO0OO) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String strOooOO0O = OooOo.OooOO0O("SCAR version ", scarAdapterVersion.name(), " is not supported.");
        oooO0OO.handleError(new OooO00o(OooO0O0.f28629OooOoo0, strOooOO0O, new Object[0]));
        DeviceLog.debug(strOooOO0O);
    }

    public OooO createScarAdapter(ScarAdapterVersion scarAdapterVersion, OooO0OO oooO0OO) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i = C42311.f13184x776ad9a7[scarAdapterVersion.ordinal()];
        if (i == 1) {
            String versionName = SdkProperties.getVersionName();
            o0000O00 o0000o00 = new o0000O00(oooO0OO, 0);
            o000O0O0.OooO0O0 oooO0O0 = new o000O0O0.OooO0O0(versionName, 2);
            o000O0O0 o000o0o02 = new o000O0O0();
            o000o0o02.f31128OooO00o = oooO0O0;
            o0000o00.f31126OooO0o = o000o0o02;
            o00.OooO0O0 oooO0O02 = new o00.OooO0O0();
            oooO0O02.f28887OooO0OO = o000o0o02;
            o0000o00.f31122OooO00o = oooO0O02;
            return o0000o00;
        }
        if (i != 2) {
            reportAdapterFailure(scarAdapterVersion, oooO0OO);
            return null;
        }
        String versionName2 = SdkProperties.getVersionName();
        o0000O00 o0000o002 = new o0000O00(oooO0OO, 1);
        o000O0O0.OooO0O0 oooO0O03 = new o000O0O0.OooO0O0(versionName2, 2);
        o0O0ooO.OooO00o oooO00o = new o0O0ooO.OooO00o();
        oooO00o.f32828OooO00o = oooO0O03;
        o0000o002.f31126OooO0o = oooO00o;
        o00O000.OooO00o oooO00o2 = new o00O000.OooO00o();
        oooO00o2.f31256OooO0OO = oooO00o;
        o0000o002.f31122OooO00o = oooO00o2;
        return o0000o002;
    }
}
