package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.ads.AbstractC2183w4;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.al */
/* loaded from: classes2.dex */
public final class C2654al {

    /* renamed from: ﻐ */
    private static char[] f4667 = {'s', 'e', 't', '_', 'g', 'm', 'n', 'a', 'l', 'v', 'p', 'y', 'i', 'u', 'c', 'd'};

    /* renamed from: ﻛ */
    private static char f4668 = 4;

    /* renamed from: ｋ */
    private static int f4669 = 1;

    /* renamed from: ﾒ */
    private static int f4670;

    /* renamed from: ﾇ */
    private final C2651ai f4671;

    public C2654al(C2651ai c2651ai) {
        this.f4671 = c2651ai;
    }

    /* renamed from: ﾒ */
    private static JSONObject m5094(ISAdQualitySegment iSAdQualitySegment) throws JSONException {
        JSONObject jSONObject = new JSONObject(iSAdQualitySegment.getCustomData());
        try {
            if (!TextUtils.isEmpty(iSAdQualitySegment.getName())) {
                int i = f4669 + 47;
                f4670 = i % 128;
                jSONObject.put(i % 2 != 0 ? m5093((byte) (116 >> ExpandableListView.getPackedPositionChild(0L)), "\u0004\b\u0007\u0006", Drawable.resolveOpacity(0, 0) * 3).intern() : m5093((byte) (ExpandableListView.getPackedPositionChild(0L) + 48), "\u0004\b\u0007\u0006", 4 - Drawable.resolveOpacity(0, 0)).intern(), iSAdQualitySegment.getName());
            }
            if (iSAdQualitySegment.getAge() != -1) {
                jSONObject.put(m5093((byte) (TextUtils.lastIndexOf("", '0') + 50), "\u0003\u0004\u0005\u0000", AndroidCharacter.getMirror('0') - ',').intern(), iSAdQualitySegment.getAge());
            }
            if (!TextUtils.isEmpty(iSAdQualitySegment.getGender())) {
                jSONObject.put(m5093((byte) (63 - TextUtils.lastIndexOf("", '0', 0)), "\u0004\b\u0002\u0005", 4 - KeyEvent.getDeadChar(0, 0)).intern(), iSAdQualitySegment.getGender());
            }
            if (iSAdQualitySegment.getLevel() != -1) {
                f4669 = (f4670 + 21) % 128;
                jSONObject.put(m5093((byte) (119 - (ViewConfiguration.getFadingEdgeLength() >> 16)), "\u0004\f\n\t", 4 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), iSAdQualitySegment.getLevel());
            }
            if (iSAdQualitySegment.getIsPaying() != null) {
                jSONObject.put(m5093((byte) (113 - TextUtils.lastIndexOf("", '0', 0)), "\u0002\b\u000b\u000f", (ViewConfiguration.getWindowTouchSlop() >> 8) + 4).intern(), iSAdQualitySegment.getIsPaying().get());
            }
            if (iSAdQualitySegment.getInAppPurchasesTotal() != -1.0d) {
                jSONObject.put(m5093((byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 34), "\u0004\u0000\u0006\u000b\u0095", Color.alpha(0) + 5).intern(), iSAdQualitySegment.getInAppPurchasesTotal());
            }
            if (iSAdQualitySegment.getUserCreationDate() != 0) {
                f4670 = (f4669 + 19) % 128;
                jSONObject.put(m5093((byte) (123 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "\u0001\f\u000f\f", TextUtils.getTrimmedLength("") + 4).intern(), iSAdQualitySegment.getUserCreationDate());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: ﾇ */
    public final void m5095(ISAdQualitySegment iSAdQualitySegment) {
        C2651ai c2651ai;
        byte b;
        int iMakeMeasureSpec;
        int i = f4669 + 113;
        f4670 = i % 128;
        if (i % 2 != 0) {
            c2651ai = this.f4671;
            b = (byte) (100 >>> (PointF.length(2.0f, 0.0f) > 1.0f ? 1 : (PointF.length(2.0f, 0.0f) == 1.0f ? 0 : -1)));
            iMakeMeasureSpec = 83 >>> View.MeasureSpec.makeMeasureSpec(1, 1);
        } else {
            c2651ai = this.f4671;
            b = (byte) (34 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
            iMakeMeasureSpec = 11 - View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        c2651ai.m5048(m5093(b, "\u0001\u0002\u0003\u0000\u0001\u0002\u0005\u0006\u0002\u0005\u0096", iMakeMeasureSpec).intern(), m5094(iSAdQualitySegment));
    }

    /* renamed from: ﾇ */
    private static String m5093(byte b, String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2858i.f6710) {
            try {
                char[] cArr2 = f4667;
                char c = f4668;
                char[] cArr3 = new char[i];
                if (i % 2 != 0) {
                    i--;
                    cArr3[i] = (char) (cArr[i] - b);
                }
                if (i > 1) {
                    C2858i.f6715 = 0;
                    while (true) {
                        int i2 = C2858i.f6715;
                        if (i2 >= i) {
                            break;
                        }
                        C2858i.f6714 = cArr[i2];
                        C2858i.f6712 = cArr[C2858i.f6715 + 1];
                        if (C2858i.f6714 == C2858i.f6712) {
                            cArr3[C2858i.f6715] = (char) (C2858i.f6714 - b);
                            cArr3[C2858i.f6715 + 1] = (char) (C2858i.f6712 - b);
                        } else {
                            C2858i.f6713 = C2858i.f6714 / c;
                            C2858i.f6709 = C2858i.f6714 % c;
                            C2858i.f6711 = C2858i.f6712 / c;
                            C2858i.f6708 = C2858i.f6712 % c;
                            if (C2858i.f6709 == C2858i.f6708) {
                                C2858i.f6713 = AbstractC2183w4.OooOoOO(C2858i.f6713, c, 1, c);
                                C2858i.f6711 = AbstractC2183w4.OooOoOO(C2858i.f6711, c, 1, c);
                                int i3 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i4 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i5 = C2858i.f6715;
                                cArr3[i5] = cArr2[i3];
                                cArr3[i5 + 1] = cArr2[i4];
                            } else if (C2858i.f6713 == C2858i.f6711) {
                                C2858i.f6709 = AbstractC2183w4.OooOoOO(C2858i.f6709, c, 1, c);
                                C2858i.f6708 = AbstractC2183w4.OooOoOO(C2858i.f6708, c, 1, c);
                                int i6 = (C2858i.f6713 * c) + C2858i.f6709;
                                int i7 = (C2858i.f6711 * c) + C2858i.f6708;
                                int i8 = C2858i.f6715;
                                cArr3[i8] = cArr2[i6];
                                cArr3[i8 + 1] = cArr2[i7];
                            } else {
                                int i9 = (C2858i.f6713 * c) + C2858i.f6708;
                                int i10 = (C2858i.f6711 * c) + C2858i.f6709;
                                int i11 = C2858i.f6715;
                                cArr3[i11] = cArr2[i9];
                                cArr3[i11 + 1] = cArr2[i10];
                            }
                        }
                        C2858i.f6715 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
