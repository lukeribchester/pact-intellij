package io.kadena.pact.ide.highlighting

internal const val PACT_EXAMPLE =
            ";; Define a module\n" +
            "(module GenericModule 'alice\n" +
            "\n" +
            "  ;; Define a keyset\n" +
            "  (defconst EXAMPLE_KEYSET 'example-keyset)\n" +
            "\n" +
            "  ;; Simple schema definition\n" +
            "  (defschema example-schema\n" +
            "    attribute1: integer\n" +
            "    attribute2: string\n" +
            "    attribute3: bool)\n" +
            "\n" +
            "  ;; Table using the simple schema\n" +
            "  (deftable example-table:{example-schema})\n" +
            "\n" +
            "  ;; Example of a simple function\n" +
            "  (defun example-function (param1:string param2:decimal)\n" +
            "    @doc \"An example function that does very little.\"\n" +
            "    (let ((example-variable (if (>= param2 1.0) true false)))\n" +
            "      (insert example-table \"example-id\" { \"attribute1\": param2, \"attribute2\": param1, \"attribute3\": example-variable })\n" +
            "    )\n" +
            "  )\n" +
            "\n" +
            "  ;; Lambda example for minimal data manipulation\n" +
            "  (defun lambda-example ()\n" +
            "    @doc \"A lambda function example for minimal processing.\"\n" +
            "    (let ((simple-lambda (lambda (x) (+ x 1))))\n" +
            "      (simple-lambda 5)\n" +
            "    )\n" +
            "  )\n" +
            "\n" +
            "  ;; Function using basic data types and operations\n" +
            "  (defun types-example ()\n" +
            "    @doc \"Function to demonstrate basic types and operations.\"\n" +
            "    (let ((int-example 123)\n" +
            "          (bool-example true)\n" +
            "          (string-example \"Hello, Pact!\"))\n" +
            "      (if bool-example int-example (length string-example))\n" +
            "    )\n" +
            "  )\n" +
            "\n" +
            "  ;; Example using basic control flow\n" +
            "  (defun control-flow-example ()\n" +
            "    @doc \"Simple control flow example.\"\n" +
            "    (let ((condition false))\n" +
            "      (if condition\n" +
            "          \"Condition is true\"\n" +
            "          \"Condition is false\")\n" +
            "    )\n" +
            "  )\n" +
            ")\n"
