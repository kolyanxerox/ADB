package com.ironsource.adqualitysdk.sdk.p009i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okio.Utf8;
import com.ironsource.InterfaceC3173h3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.au */
/* loaded from: classes2.dex */
public final class C2663au {

    /* renamed from: ﭖ */
    private static int f4758 = 0;

    /* renamed from: ﭸ */
    private static short[] f4759 = null;

    /* renamed from: ﮉ */
    private static int f4760 = 1;

    /* renamed from: ﮐ */
    private static int f4761 = 91;

    /* renamed from: ﱟ */
    private static long f4762 = -2712609236675154410L;

    /* renamed from: ﱡ */
    private static int f4763 = -1881330655;

    /* renamed from: ﺙ */
    private static int f4764 = 419090097;

    /* renamed from: ﻏ */
    private static byte[] f4765 = {51, 61, -59, 59, -61, 39, 20, -21, 21, -18, 49, -59, 20, -23, 19, 45, -15, -49, 51, -63, 59, 55, -64, Utf8.REPLACEMENT_BYTE, -59, 114, -13, 49, -59, 52, -55, 51, 13, -9, -56, 58, -124, -118, 114, -116, 116, -112, -93, 92, -94, 89, -122, 114, -93, 94, -92, -102, 70, 120, -124, 118, -116, -128, 119, -120, 114, -59, 58, -114, -126, -78, 68, -122, 114, -125, 126, -124, -70, 64, 127, -115, 89, 85, 87, -120, 105, -125, -65, -76, 67, -26, -63, -53, 54, 52, -53, -53, 38, 55, 3, -10, -77, 68, 75, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: ﻐ */
    private JSONObject f4766;

    /* renamed from: ﻛ */
    private JSONObject f4767;

    /* renamed from: ｋ */
    private final List<String> f4768;

    /* renamed from: ﾒ */
    private final List<String> f4770 = Arrays.asList(m5212("\uf49f\uf4fc衊☳洧ㅦﭹ\uf115䲦䀳▆㦑葀㢜\ufdde膥\udde0\uf148됰졅ᖖꤠಝჵ", ViewConfiguration.getWindowTouchSlop() >> 8).intern(), m5212("\uea35\uea54憪쿒朝㭕߹\u0dc9刂꧕⾵앍髲텱\uf7eb絠썔ᢸ빏", ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern(), "");

    /* renamed from: ﾇ */
    private final List<String> f4769 = new ArrayList();

    public C2663au() throws JSONException {
        List<String> listAsList = Arrays.asList(m5210((byte) (TextUtils.indexOf((CharSequence) "", '0') + 55), (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-16777270) - Color.rgb(0, 0, 0), Gravity.getAbsoluteGravity(0, 0) - 419090097, 1881330754 - TextUtils.getOffsetAfter("", 0)).intern(), m5210((byte) ((-127) - (ViewConfiguration.getJumpTapTimeout() >> 16)), (short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 51, Color.alpha(0) - 419090061, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1881330754).intern(), m5212("䶈䷡鄖㽯█禊䢜䊮\uf5a2奤浽詧㵟⇌땸㈇擮\ue805ﳛ箤겛끭䑯ꍊ푙磀谂\ueb48ῑ㼧ퟂᒫ䞒蝢Ὢ屟輼俐朇藲㛑ᘢ꺺춯纎\ude80\uf662畗", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), m5212("䵁䴨퀌繵᱉䁋莏覽\uf56b\u187e咼䅴㶖惖貹樂搧ꤟ씚낷걒\uf177綮桙풐㧚뗃⁛ἤ縺\uee59\udf94䝇왿⚺靗迲໗廎仹㘰场靣ڔ繒龇쾾빋ꛠ\ue7df߆", MotionEvent.axisFromString("") + 1).intern());
        this.f4768 = listAsList;
        m5212("逳遄뛎\u18ae嶂Ǟ职", View.MeasureSpec.makeMeasureSpec(0, 0)).intern();
        m5210((byte) ((-88) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (short) View.MeasureSpec.getSize(0), (ViewConfiguration.getPressedStateDuration() >> 16) - 87, Drawable.resolveOpacity(0, 0) - 419090021, View.MeasureSpec.getMode(0) + 1881330774).intern();
        m5212("梯棆龩㇜浊ㄖ㊗", TextUtils.indexOf("", "")).intern();
        m5210((byte) (121 - KeyEvent.getDeadChar(0, 0)), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (-87) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-419090018) - Color.argb(0, 0, 0, 0), 1881330760 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern();
        m5212("꭪ꬌ骋㓩\uee3d뉩፴", TextUtils.indexOf((CharSequence) "", '0', 0) + 1).intern();
        m5212("㔚㕿㜾饜\ude0b艟쫉", ViewConfiguration.getFadingEdgeLength() >> 16).intern();
        m5210((byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 69), (short) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) - 87, (Process.myPid() >> 22) - 419090015, TextUtils.indexOf((CharSequence) "", '0') + 1881330761).intern();
        this.f4766 = new JSONObject();
        this.f4767 = new JSONObject();
        try {
            Iterator<String> it = listAsList.iterator();
            while (it.hasNext()) {
                this.f4767.put(it.next(), m5210((byte) (View.MeasureSpec.getSize(0) + 28), (short) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (-90) - TextUtils.lastIndexOf("", '0', 0), (-419090012) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1881330769 - Color.green(0)).intern());
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﻛ */
    public static /* synthetic */ void m5211(C2663au c2663au, String str) {
        f4758 = (f4760 + 41) % 128;
        c2663au.m5213(str);
        f4760 = (f4758 + 35) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m5213(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.p009i.C2663au.f4760
            int r0 = r0 + 105
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2663au.f4758 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L17
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 14
            int r1 = r1 / 0
            if (r0 != 0) goto L25
            goto L1d
        L17:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L25
        L1d:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L25
            r0.<init>(r3)     // Catch: org.json.JSONException -> L25
            r2.f4766 = r0     // Catch: org.json.JSONException -> L25
            return
        L25:
            int r3 = com.ironsource.adqualitysdk.sdk.p009i.C2663au.f4758
            int r3 = r3 + 73
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.p009i.C2663au.f4760 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p009i.C2663au.m5213(java.lang.String):void");
    }

    /* renamed from: ﮐ */
    public final String m5214() {
        f4758 = (f4760 + 43) % 128;
        String strOptString = this.f4766.optString(m5212("胾肚㽋鄩冤෬뷥럓", 1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), m5212("ꃳꂒ鬼㕞㴔慔\ue667", ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern());
        int i = f4758 + 115;
        f4760 = i % 128;
        if (i % 2 != 0) {
            return strOptString;
        }
        throw null;
    }

    /* renamed from: ﱡ */
    public final int m5215() {
        f4760 = (f4758 + 83) % 128;
        int iOptInt = this.f4766.optInt(m5210((byte) (64 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (short) TextUtils.getOffsetBefore("", 0), (-87) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (-419090001) - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1881330754 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), 3000);
        f4760 = (f4758 + 69) % 128;
        return iOptInt;
    }

    /* renamed from: ﺙ */
    public final JSONObject m5216() {
        JSONObject jSONObjectOptJSONObject = this.f4766.optJSONObject(m5212("\uf56b\uf50f뾲ᇐ祧┭␒⸳", (-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        int i = f4758;
        int i2 = i + InterfaceC3173h3.d.b.f8823f;
        f4760 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        JSONObject jSONObject = this.f4767;
        f4760 = (i + 5) % 128;
        return jSONObject;
    }

    /* renamed from: ﻏ */
    public final List<String> m5217() {
        List<String> listM7436 = C2915kc.m7436(this.f4766, m5212("㔚㕿㜾饜\ude0b艟쫉", KeyEvent.keyCodeFromString("")).intern(), new ArrayList());
        int i = f4760 + 37;
        f4758 = i % 128;
        if (i % 2 == 0) {
            return listM7436;
        }
        throw null;
    }

    /* renamed from: ﻐ */
    public final void m5219(C2882ix c2882ix) {
        m5213(c2882ix.m7162(m5210((byte) (Gravity.getAbsoluteGravity(0, 0) - 55), (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (-82) - (KeyEvent.getMaxKeyCode() >> 16), (-419090011) - (Process.myPid() >> 22), 1881330771 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), m5210((byte) (1 - Color.blue(0)), (short) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (-88) - TextUtils.getCapsMode("", 0, 0), Color.red(0) - 419090003, 1881330709 - TextUtils.lastIndexOf("", '0', 0)).intern(), new InterfaceC2874ip() { // from class: com.ironsource.adqualitysdk.sdk.i.au.4
            @Override // com.ironsource.adqualitysdk.sdk.p009i.InterfaceC2874ip
            /* renamed from: ﻐ */
            public final void mo5224(String str) {
                C2663au.m5211(C2663au.this, str);
            }
        }));
        int i = f4760 + InterfaceC3173h3.d.b.f8826i;
        f4758 = i % 128;
        if (i % 2 != 0) {
            int i2 = 96 / 0;
        }
    }

    /* renamed from: ｋ */
    public final List<String> m5221() {
        f4760 = (f4758 + 113) % 128;
        List<String> listM7436 = C2915kc.m7436(this.f4766, m5212("梯棆龩㇜浊ㄖ㊗", ViewConfiguration.getTouchSlop() >> 8).intern(), this.f4769);
        int i = f4760 + 91;
        f4758 = i % 128;
        if (i % 2 != 0) {
            int i2 = 56 / 0;
        }
        return listM7436;
    }

    /* renamed from: ﾒ */
    public final int m5223() {
        f4758 = (f4760 + 85) % 128;
        int iOptInt = this.f4766.optInt(m5210((byte) ((ViewConfiguration.getEdgeSlop() >> 16) - 88), (short) (ViewConfiguration.getWindowTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0') - 86, (-419090022) - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1881330774).intern(), 7);
        f4758 = (f4760 + 35) % 128;
        return iOptInt;
    }

    /* renamed from: ﻛ */
    public final List<String> m5220() {
        List<String> listM7436 = C2915kc.m7436(this.f4766, m5212("꭪ꬌ骋㓩\uee3d뉩፴", Color.red(0)).intern(), new ArrayList());
        f4760 = (f4758 + 25) % 128;
        return listM7436;
    }

    /* renamed from: ﻛ */
    private static String m5210(byte b, short s, int i, int i2, int i3) {
        String string;
        synchronized (C2912k.f7200) {
            try {
                StringBuilder sb = new StringBuilder();
                int i4 = f4761;
                int i5 = i + i4;
                int i6 = i5 == -1 ? 1 : 0;
                if (i6 != 0) {
                    byte[] bArr = f4765;
                    if (bArr != null) {
                        i5 = (byte) (bArr[f4764 + i2] + i4);
                    } else {
                        i5 = (short) (f4759[f4764 + i2] + i4);
                    }
                }
                if (i5 > 0) {
                    C2912k.f7203 = ((i2 + i5) - 2) + f4764 + i6;
                    C2912k.f7201 = b;
                    char c = (char) (i3 + f4763);
                    C2912k.f7204 = c;
                    sb.append(c);
                    C2912k.f7202 = C2912k.f7204;
                    C2912k.f7205 = 1;
                    while (C2912k.f7205 < i5) {
                        byte[] bArr2 = f4765;
                        if (bArr2 != null) {
                            int i7 = C2912k.f7203;
                            C2912k.f7203 = i7 - 1;
                            C2912k.f7204 = (char) (C2912k.f7202 + (((byte) (bArr2[i7] + s)) ^ C2912k.f7201));
                        } else {
                            short[] sArr = f4759;
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

    /* renamed from: ﻐ */
    public final int m5218() {
        f4760 = (f4758 + 37) % 128;
        int iOptInt = this.f4766.optInt(m5210((byte) (121 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (short) View.MeasureSpec.makeMeasureSpec(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 88, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 419090017, ImageFormat.getBitsPerPixel(0) + 1881330761).intern(), 2);
        f4760 = (f4758 + 125) % 128;
        return iOptInt;
    }

    /* renamed from: ﾇ */
    public final List<String> m5222() {
        JSONObject jSONObject;
        int maxKeyCode;
        int i = f4758 + 79;
        f4760 = i % 128;
        if (i % 2 == 0) {
            jSONObject = this.f4766;
            maxKeyCode = KeyEvent.getMaxKeyCode() / 99;
        } else {
            jSONObject = this.f4766;
            maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
        }
        List<String> listM7436 = C2915kc.m7436(jSONObject, m5212("逳遄뛎\u18ae嶂Ǟ职", maxKeyCode).intern(), this.f4770);
        int i2 = f4760 + 15;
        f4758 = i2 % 128;
        if (i2 % 2 == 0) {
            return listM7436;
        }
        throw null;
    }

    /* renamed from: ﾇ */
    private static String m5212(String str, int i) {
        String str2;
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        synchronized (C2777f.f6322) {
            try {
                char[] cArrM6790 = C2777f.m6790(f4762, cArr, i);
                C2777f.f6321 = 4;
                while (true) {
                    int i2 = C2777f.f6321;
                    if (i2 < cArrM6790.length) {
                        C2777f.f6320 = i2 - 4;
                        cArrM6790[i2] = (char) ((cArrM6790[i2] ^ cArrM6790[i2 % 4]) ^ (r2 * f4762));
                        C2777f.f6321 = i2 + 1;
                    } else {
                        str2 = new String(cArrM6790, 4, cArrM6790.length - 4);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
