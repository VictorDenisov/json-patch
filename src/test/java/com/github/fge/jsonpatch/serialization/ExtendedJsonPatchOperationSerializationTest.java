package com.github.fge.jsonpatch.serialization;

import com.github.fge.jsonpatch.ExtendedJsonPatch;
import org.testng.annotations.Test;

import java.io.IOException;

@Test
public abstract class ExtendedJsonPatchOperationSerializationTest extends JsonPatchOperationSerializationTest
{
    protected ExtendedJsonPatchOperationSerializationTest(final String operationName)
        throws IOException
    {
        super("extended", operationName, ExtendedJsonPatch.getReader(), ExtendedJsonPatch.getWriter());
    }
}

