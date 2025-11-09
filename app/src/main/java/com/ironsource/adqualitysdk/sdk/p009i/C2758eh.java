package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.eh */
/* loaded from: classes2.dex */
public final class C2758eh extends AbstractC2760ej {

    /* renamed from: ﱟ */
    private static int f6254 = 1;

    /* renamed from: ﺙ */
    private static int f6255 = 0;

    /* renamed from: ﻐ */
    private static int f6256 = -684344474;

    /* renamed from: ﻛ */
    private static short[] f6257 = null;

    /* renamed from: ｋ */
    private static byte[] f6258 = {37, 79, -100, -93, -109, -99, -85, -112, -97, -107, -80, -30, 73, -84, -101, -28, 73, -95, -92, -108, -84, -115, -82, -118, -97, -16, 86, -106, -94, -110, -80, -119, -90, -88, -120, -82, -30, 75, -96, -102, -99, -54, 36, -55, 46, 27, 24, 37, 16, 108, -39, 28, 14, 31, 32, 28, 29, 24, 31, 34, 22, 114, -49, 28, 108, -32, 31, 88, -40, 15, 27, 114, -50, 24, 113, -42, 22, 34, 13, 36, 27, 113, 3};

    /* renamed from: ﾇ */
    private static int f6259 = 5;

    /* renamed from: ﾒ */
    private static int f6260 = -1158122413;

    public C2758eh(AbstractC2755ee abstractC2755ee, AbstractC2755ee abstractC2755ee2, C2736dm c2736dm) {
        super(abstractC2755ee, abstractC2755ee2, c2736dm);
    }

    /* renamed from: ﻛ */
    private static String m6768(byte b, short s, int i, int i2, int i3) {
        String string;
        synchronized (C2912k.f7200) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = f6259;
                int i5 = i + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f6258;
                    i5 = bArr != null ? (byte) (bArr[f6256 + i2] + i4) : (short) (f6257[f6256 + i2] + i4);
                }
                if (i5 > 0) {
                    C2912k.f7203 = ((i2 + i5) - 2) + f6256 + i6;
                    C2912k.f7201 = b;
                    char c = (char) (i3 + f6260);
                    C2912k.f7204 = c;
                    sb.append(c);
                    C2912k.f7202 = C2912k.f7204;
                    C2912k.f7205 = 1;
                    while (C2912k.f7205 < i5) {
                        byte[] bArr2 = f6258;
                        if (bArr2 != null) {
                            int i7 = C2912k.f7203;
                            C2912k.f7203 = i7 - 1;
                            C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                        } else {
                            short[] sArr = f6257;
                            int i8 = C2912k.f7203;
                            C2912k.f7203 = i8 - 1;
                            C2912k.f7204 = (char) (C2912k.f7202 + (((short) (sArr[i8] + s)) ^ C2912k.f7201));
                        }
                        sb.append(C2912k.f7204);
                        C2912k.f7202 = C2912k.f7204;
                        C2912k.f7205++;
                    }
                }
                string = sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p009i.AbstractC2755ee
    /* renamed from: ｋ */
    public final C2744du mo6724(C2741dr c2741dr, C2712cp c2712cp) {
        Object objM6717;
        C2744du c2744duM6760 = m6771().m6760(c2741dr, c2712cp);
        try {
            objM6717 = m6772().m6760(c2741dr, c2712cp).m6717();
        } catch (Exception e) {
            String strM6290 = c2712cp.m6290();
            StringBuilder sb = new StringBuilder();
            sb.append(m6768((byte) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) (99 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (-5) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 684344474, 1158122483 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern());
            sb.append(this);
            sb.append(m6759());
            C2713cq.m6350(strM6290, sb.toString(), e);
        }
        if (objM6717 instanceof JSONObject) {
            return new C2744du(((JSONObject) objM6717).opt((String) c2744duM6760.m6717()));
        }
        if (objM6717 instanceof JSONArray) {
            return new C2744du(((JSONArray) objM6717).opt(c2744duM6760.m6722().intValue()));
        }
        if (objM6717 instanceof Map) {
            return new C2744du(((Map) objM6717).get(c2744duM6760.m6717()));
        }
        if (objM6717 instanceof List) {
            return new C2744du(((List) objM6717).get(c2744duM6760.m6722().intValue()));
        }
        if (objM6717.getClass().isArray()) {
            C2744du c2744du = new C2744du(((Object[]) objM6717)[c2744duM6760.m6722().intValue()]);
            int i = f6255 + 123;
            f6254 = i % 128;
            if (i % 2 != 0) {
                return c2744du;
            }
            throw null;
        }
        String strM62902 = c2712cp.m6290();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6768((byte) TextUtils.getOffsetBefore("", 0), (short) (99 - View.resolveSizeAndState(0, 0, 0)), (-6) - (ViewConfiguration.getEdgeSlop() >> 16), View.resolveSize(0, 0) + 684344474, 1158122482 - ExpandableListView.getPackedPositionGroup(0L)).intern());
        sb2.append(this);
        sb2.append(m6759());
        sb2.append(m6768((byte) Color.red(0), (short) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 29), TextUtils.getCapsMode("", 0, 0) - 6, 684344516 - (ViewConfiguration.getTapTimeout() >> 16), 1158122471 - Color.green(0)).intern());
        sb2.append(objM6717);
        C2713cq.m6350(strM62902, sb2.toString(), null);
        C2744du c2744du2 = new C2744du(null);
        int i2 = f6254 + 81;
        f6255 = i2 % 128;
        if (i2 % 2 == 0) {
            return c2744du2;
        }
        throw null;
    }
}
