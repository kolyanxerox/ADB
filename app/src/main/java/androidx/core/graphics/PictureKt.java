package androidx.core.graphics;

import android.graphics.Picture;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
public final class PictureKt {
    public static final Picture record(Picture picture, int i, int i2, Oooo000 oooo000) {
        try {
            oooo000.invoke(picture.beginRecording(i, i2));
            return picture;
        } finally {
            picture.endRecording();
        }
    }
}
