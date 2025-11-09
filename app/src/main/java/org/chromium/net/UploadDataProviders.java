package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.nio.ByteBuffer;
import o000Ooo.o00oO0o;

/* loaded from: classes3.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new OooO0o(new o000O0O0.OooO00o(file));
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new OooO0o(new o00oO0o(parcelFileDescriptor, 22));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new OooO0O0(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new OooO0O0(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
