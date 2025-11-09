package com.google.android.gms.internal.measurement;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes2.dex */
public abstract class o0OO00OO {

    /* renamed from: OooO00o */
    public static o000O0Oo.OooO0o f26541OooO00o;

    public static int OooO(byte[] bArr, int i, OooOOOO.OooO0O0 oooO0O0) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        int iOooOOo0 = OooOOo0(bArr, i, oooO0O0);
        int i2 = oooO0O0.f13327OooOo;
        if (i2 < 0) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0o();
        }
        if (i2 > bArr.length - iOooOOo0) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0oo();
        }
        if (i2 == 0) {
            oooO0O0.f13330OooOoO0 = com.google.crypto.tink.shaded.protobuf.OooOOO0.f28025OooOo0o;
            return iOooOOo0;
        }
        oooO0O0.f13330OooOoO0 = com.google.crypto.tink.shaded.protobuf.OooOOO0.OooO0oO(bArr, iOooOOo0, i2);
        return iOooOOo0 + i2;
    }

    public static Object OooO00o(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void OooO0O0(int i, Bundle bundle, Parcel parcel) {
        if (bundle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, i);
        }
    }

    public static void OooO0OO(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                DrawableCompat.setTintList(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                DrawableCompat.setTintList(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                DrawableCompat.setTintMode(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final long OooO0Oo(long j, o00O0oOO.OooOOO sourceUnit, o00O0oOO.OooOOO targetUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(targetUnit, "targetUnit");
        return targetUnit.f31471OooOo0O.convert(j, sourceUnit.f31471OooOo0O);
    }

    public static final void OooO0o(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException(OooO0oO.OooOo.OooO("toIndex (", i, ") is greater than size (", i2, ")."));
        }
    }

    public static final long OooO0o0(long j, o00O0oOO.OooOOO sourceUnit, o00O0oOO.OooOOO targetUnit) {
        kotlin.jvm.internal.OooOo.OooO0o0(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.OooOo.OooO0o0(targetUnit, "targetUnit");
        return targetUnit.f31471OooOo0O.convert(j, sourceUnit.f31471OooOo0O);
    }

    public static final long OooO0oO(InputStream inputStream, OutputStream outputStream) throws IOException {
        kotlin.jvm.internal.OooOo.OooO0o0(inputStream, "<this>");
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j = 0;
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            j += i;
            i = inputStream.read(bArr);
        }
        return j;
    }

    public static void OooO0oo(String str, Object obj, String str2) {
        String strOooOo0O = OooOo0O(str);
        if (Log.isLoggable(strOooOo0O, 3)) {
            Log.d(strOooOo0O, String.format(str2, obj));
        }
    }

    public static int OooOO0(byte[] bArr, int i) {
        return ((bArr[i + 3] & ForkServer.ERROR) << 24) | (bArr[i] & ForkServer.ERROR) | ((bArr[i + 1] & ForkServer.ERROR) << 8) | ((bArr[i + 2] & ForkServer.ERROR) << 16);
    }

    public static long OooOO0O(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int OooOO0o(com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o02, int i, byte[] bArr, int i2, int i3, com.google.crypto.tink.shaded.protobuf.o0OO00O o0oo00o, OooOOOO.OooO0O0 oooO0O0) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        Object objNewInstance = o000o0o02.newInstance();
        com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o03 = o000o0o02;
        byte[] bArr2 = bArr;
        int i4 = i3;
        OooOOOO.OooO0O0 oooO0O02 = oooO0O0;
        int iOooOo = OooOo(objNewInstance, o000o0o03, bArr2, i2, i4, oooO0O02);
        o000o0o03.makeImmutable(objNewInstance);
        oooO0O02.f13330OooOoO0 = objNewInstance;
        o0oo00o.add(objNewInstance);
        while (iOooOo < i4) {
            OooOOOO.OooO0O0 oooO0O03 = oooO0O02;
            int i5 = i4;
            int iOooOOo0 = OooOOo0(bArr2, iOooOo, oooO0O03);
            if (i != oooO0O03.f13327OooOo) {
                break;
            }
            byte[] bArr3 = bArr2;
            com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o04 = o000o0o03;
            Object objNewInstance2 = o000o0o04.newInstance();
            iOooOo = OooOo(objNewInstance2, o000o0o04, bArr3, iOooOOo0, i5, oooO0O03);
            o000o0o03 = o000o0o04;
            bArr2 = bArr3;
            i4 = i5;
            oooO0O02 = oooO0O03;
            o000o0o03.makeImmutable(objNewInstance2);
            oooO0O02.f13330OooOoO0 = objNewInstance2;
            o0oo00o.add(objNewInstance2);
        }
        return iOooOo;
    }

    public static int OooOOO(byte[] bArr, int i, OooOOOO.OooO0O0 oooO0O0) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        int iOooOOo0 = OooOOo0(bArr, i, oooO0O0);
        int i2 = oooO0O0.f13327OooOo;
        if (i2 < 0) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0o();
        }
        if (i2 == 0) {
            oooO0O0.f13330OooOoO0 = "";
            return iOooOOo0;
        }
        oooO0O0.f13330OooOoO0 = com.google.crypto.tink.shaded.protobuf.oo00o.f28133OooO00o.OooOOO(bArr, iOooOOo0, i2);
        return iOooOOo0 + i2;
    }

    public static int OooOOO0(byte[] bArr, int i, OooOOOO.OooO0O0 oooO0O0) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        int iOooOOo0 = OooOOo0(bArr, i, oooO0O0);
        int i2 = oooO0O0.f13327OooOo;
        if (i2 < 0) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0o();
        }
        if (i2 == 0) {
            oooO0O0.f13330OooOoO0 = "";
            return iOooOOo0;
        }
        oooO0O0.f13330OooOoO0 = new String(bArr, iOooOOo0, i2, com.google.crypto.tink.shaded.protobuf.oo0o0Oo.f28134OooO00o);
        return iOooOOo0 + i2;
    }

    public static int OooOOOO(int i, byte[] bArr, int i2, int i3, com.google.crypto.tink.shaded.protobuf.o000OOo0 o000ooo02, OooOOOO.OooO0O0 oooO0O0) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        if ((i >>> 3) == 0) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO00o();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iOooOOoo = OooOOoo(bArr, i2, oooO0O0);
            o000ooo02.OooO0Oo(i, Long.valueOf(oooO0O0.f13329OooOo0o));
            return iOooOOoo;
        }
        if (i4 == 1) {
            o000ooo02.OooO0Oo(i, Long.valueOf(OooOO0O(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iOooOOo0 = OooOOo0(bArr, i2, oooO0O0);
            int i5 = oooO0O0.f13327OooOo;
            if (i5 < 0) {
                throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0o();
            }
            if (i5 > bArr.length - iOooOOo0) {
                throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0oo();
            }
            if (i5 == 0) {
                o000ooo02.OooO0Oo(i, com.google.crypto.tink.shaded.protobuf.OooOOO0.f28025OooOo0o);
            } else {
                o000ooo02.OooO0Oo(i, com.google.crypto.tink.shaded.protobuf.OooOOO0.OooO0oO(bArr, iOooOOo0, i5));
            }
            return iOooOOo0 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO00o();
            }
            o000ooo02.OooO0Oo(i, Integer.valueOf(OooOO0(bArr, i2)));
            return i2 + 4;
        }
        com.google.crypto.tink.shaded.protobuf.o000OOo0 o000ooo0OooO0OO = com.google.crypto.tink.shaded.protobuf.o000OOo0.OooO0OO();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iOooOOo02 = OooOOo0(bArr, i2, oooO0O0);
            i7 = oooO0O0.f13327OooOo;
            if (i7 == i6) {
                i2 = iOooOOo02;
                break;
            }
            i2 = OooOOOO(i7, bArr, iOooOOo02, i3, o000ooo0OooO0OO, oooO0O0);
        }
        if (i2 > i3 || i7 != i6) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0oO();
        }
        o000ooo02.OooO0Oo(i, o000ooo0OooO0OO);
        return i2;
    }

    public static int OooOOOo(int i, int i2, OooOOOO.OooO0O0 oooO0O0, byte[] bArr) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            oooO0O0.f13327OooOo = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            oooO0O0.f13327OooOo = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            oooO0O0.f13327OooOo = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            oooO0O0.f13327OooOo = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                oooO0O0.f13327OooOo = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int OooOOo(int i, byte[] bArr, int i2, int i3, com.google.crypto.tink.shaded.protobuf.o0OO00O o0oo00o, OooOOOO.OooO0O0 oooO0O0) {
        com.google.crypto.tink.shaded.protobuf.o0OOO0o o0ooo0o = (com.google.crypto.tink.shaded.protobuf.o0OOO0o) o0oo00o;
        int iOooOOo0 = OooOOo0(bArr, i2, oooO0O0);
        o0ooo0o.addInt(oooO0O0.f13327OooOo);
        while (iOooOOo0 < i3) {
            int iOooOOo02 = OooOOo0(bArr, iOooOOo0, oooO0O0);
            if (i != oooO0O0.f13327OooOo) {
                break;
            }
            iOooOOo0 = OooOOo0(bArr, iOooOOo02, oooO0O0);
            o0ooo0o.addInt(oooO0O0.f13327OooOo);
        }
        return iOooOOo0;
    }

    public static int OooOOo0(byte[] bArr, int i, OooOOOO.OooO0O0 oooO0O0) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return OooOOOo(b, i2, oooO0O0, bArr);
        }
        oooO0O0.f13327OooOo = b;
        return i2;
    }

    public static int OooOOoo(byte[] bArr, int i, OooOOOO.OooO0O0 oooO0O0) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            oooO0O0.f13329OooOo0o = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & 127) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & 127) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        oooO0O0.f13329OooOo0o = j2;
        return i3;
    }

    public static int OooOo(Object obj, com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o02, byte[] bArr, int i, int i2, OooOOOO.OooO0O0 oooO0O0) throws com.google.crypto.tink.shaded.protobuf.o000OOo {
        int iOooOOOo = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iOooOOOo = OooOOOo(i3, iOooOOOo, oooO0O0, bArr);
            i3 = oooO0O0.f13327OooOo;
        }
        int i4 = iOooOOOo;
        if (i3 < 0 || i3 > i2 - i4) {
            throw com.google.crypto.tink.shaded.protobuf.o000OOo.OooO0oo();
        }
        int i5 = i4 + i3;
        o000o0o02.OooO0o(obj, bArr, i4, i5, oooO0O0);
        oooO0O0.f13330OooOoO0 = obj;
        return i5;
    }

    public static float OooOo0(String[] strArr, int i) throws NumberFormatException {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    public static void OooOo00(String str, String str2, Exception exc) {
        String strOooOo0O = OooOo0O(str);
        if (Log.isLoggable(strOooOo0O, 6)) {
            Log.e(strOooOo0O, str2, exc);
        }
    }

    public static String OooOo0O(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String strConcat = "TRuntime.".concat(str);
        return strConcat.length() > 23 ? strConcat.substring(0, 23) : strConcat;
    }

    public static boolean OooOo0o(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static final byte[] OooOoO(InputStream inputStream) throws IOException {
        kotlin.jvm.internal.OooOo.OooO0o0(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        OooO0oO(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.OooOo.OooO0Oo(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static boolean OooOoO0(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static void OooOoOO(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
        DrawableCompat.setTintList(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static TimeInterpolator OooOoo(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!OooOo0o(strValueOf, "cubic-bezier") && !OooOo0o(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!OooOo0o(strValueOf, "cubic-bezier")) {
            if (OooOo0o(strValueOf, "path")) {
                return PathInterpolatorCompat.create(PathParser.createPathFromPathData(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return PathInterpolatorCompat.create(OooOo0(strArrSplit, 0), OooOo0(strArrSplit, 1), OooOo0(strArrSplit, 2), OooOo0(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static int OooOoo0(Context context, int i, int i2) {
        TypedValue typedValueOooO00o = oo0o0Oo.OooO0O0.OooO00o(context, i);
        return (typedValueOooO00o == null || typedValueOooO00o.type != 16) ? i2 : typedValueOooO00o.data;
    }

    public static void OooOooO(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = ViewCompat.hasOnClickListeners(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        ViewCompat.setImportantForAccessibility(checkableImageButton, z2 ? 1 : 2);
    }

    public static String OooOooo(o0000OOo.o000O o000o) throws NoSuchAlgorithmException {
        int iOrdinal = o000o.ordinal();
        if (iOrdinal == 1) {
            return "HmacSha1";
        }
        if (iOrdinal == 2) {
            return "HmacSha384";
        }
        if (iOrdinal == 3) {
            return "HmacSha256";
        }
        if (iOrdinal == 4) {
            return "HmacSha512";
        }
        if (iOrdinal == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + o000o);
    }
}
