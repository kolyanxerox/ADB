package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
public final class ShaderKt {
    public static final void transform(Shader shader, Oooo000 oooo000) {
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        oooo000.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
