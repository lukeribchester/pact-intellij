package io.kadena.pact.ide.highlighting

internal const val PACT_EXAMPLE =
            "(module coin GOVERNANCE\n" +
            "\n" +
            "  @doc \"'coin' represents the Kadena Coin Contract. This contract provides both the \\\n" +
            "  \\buy/redeem gas support in the form of 'fund-tx', as well as transfer,       \\\n" +
            "  \\credit, debit, coinbase, account creation and query, as well as SPV burn    \\\n" +
            "  \\create. To access the coin contract, you may use its fully-qualified name,  \\\n" +
            "  \\or issue the '(use coin)' command in the body of a module declaration.\"\n" +
            "\n" +
            "  @model\n" +
            "    [ (defproperty conserves-mass\n" +
            "        (= (column-delta coin-table 'balance) 0.0))\n" +
            "\n" +
            "      (defproperty valid-account (account:string)\n" +
            "        (and\n" +
            "          (>= (length account) 3)\n" +
            "          (<= (length account) 256)))\n" +
            "    ]\n" +
            "\n" +
            "  (implements fungible-v2)\n" +
            "  (implements fungible-xchain-v1)\n" +
            "\n" +
            "  ;; coin-v2\n" +
            "  (bless \"ut_J_ZNkoyaPUEJhiwVeWnkSQn9JT9sQCWKdjjVVrWo\")\n" +
            "\n" +
            "  ;; coin v3\n" +
            "  (bless \"1os_sLAUYvBzspn5jjawtRpJWiH1WPfhyNraeVvSIwU\")\n" +
            "\n" +
            "  ;; coin v4\n" +
            "  (bless \"BjZW0T2ac6qE_I5X8GE4fal6tTqjhLTC7my0ytQSxLU\")\n" +
            "\n" +
            "  ; --------------------------------------------------------------------------\n" +
            "  ; Schemas and Tables\n" +
            "\n" +
            "  (defschema coin-schema\n" +
            "    @doc \"The coin contract token schema\"\n" +
            "    @model [ (invariant (>= balance 0.0)) ]\n" +
            "\n" +
            "    balance:decimal\n" +
            "    guard:guard)\n" +
            "\n" +
            "  (deftable coin-table:{coin-schema})\n" +
            "\n" +
            "  ; --------------------------------------------------------------------------\n" +
            "  ; Capabilities\n" +
            "\n" +
            "  (defcap GOVERNANCE ()\n" +
            "    (enforce false \"Enforce non-upgradeability\"))\n" +
            "\n" +
            "  (defcap GAS ()\n" +
            "    \"Magic capability to protect gas buy and redeem\"\n" +
            "    true)\n" +
            "\n" +
            "  (defcap COINBASE ()\n" +
            "    \"Magic capability to protect miner reward\"\n" +
            "    true)\n" +
            "\n" +
            "  (defcap GENESIS ()\n" +
            "    \"Magic capability constraining genesis transactions\"\n" +
            "    true)\n" +
            "\n" +
            "  (defcap REMEDIATE ()\n" +
            "    \"Magic capability for remediation transactions\"\n" +
            "    true)\n" +
            "\n" +
            "  (defcap DEBIT (sender:string)\n" +
            "    \"Capability for managing debiting operations\"\n" +
            "    (enforce-guard (at 'guard (read coin-table sender)))\n" +
            "    (enforce (!= sender \"\") \"valid sender\"))\n" +
            "\n" +
            "  (defcap CREDIT (receiver:string)\n" +
            "    \"Capability for managing crediting operations\"\n" +
            "    (enforce (!= receiver \"\") \"valid receiver\"))\n" +
            "\n" +
            "  (defcap ROTATE (account:string)\n" +
            "    @doc \"Autonomously managed capability for guard rotation\"\n" +
            "    @managed\n" +
            "    true)\n" +
            "\n" +
            "  (defcap TRANSFER:bool\n" +
            "    ( sender:string\n" +
            "      receiver:string\n" +
            "      amount:decimal\n" +
            "    )\n" +
            "    @managed amount TRANSFER-mgr\n" +
            "    (enforce (!= sender receiver) \"same sender and receiver\")\n" +
            "    (enforce-unit amount)\n" +
            "    (enforce (> amount 0.0) \"Positive amount\")\n" +
            "    (compose-capability (DEBIT sender))\n" +
            "    (compose-capability (CREDIT receiver))\n" +
            "  )\n" +
            "\n" +
            "  (defun TRANSFER-mgr:decimal\n" +
            "    ( managed:decimal\n" +
            "      requested:decimal\n" +
            "    )\n" +
            "\n" +
            "    (let ((newbal (- managed requested)))\n" +
            "      (enforce (>= newbal 0.0)\n" +
            "        (format \"TRANSFER exceeded for balance {}\" [managed]))\n" +
            "      newbal)\n" +
            "  )\n" +
            "\n" +
            "  (defcap TRANSFER_XCHAIN:bool\n" +
            "    ( sender:string\n" +
            "      receiver:string\n" +
            "      amount:decimal\n" +
            "      target-chain:string\n" +
            "    )\n" +
            "\n" +
            "    @managed amount TRANSFER_XCHAIN-mgr\n" +
            "    (enforce-unit amount)\n" +
            "    (enforce (> amount 0.0) \"Cross-chain transfers require a positive amount\")\n" +
            "    (compose-capability (DEBIT sender))\n" +
            "  )\n" +
            "\n" +
            "  (defun TRANSFER_XCHAIN-mgr:decimal\n" +
            "    ( managed:decimal\n" +
            "      requested:decimal\n" +
            "    )\n" +
            "\n" +
            "    (enforce (>= managed requested)\n" +
            "      (format \"TRANSFER_XCHAIN exceeded for balance {}\" [managed]))\n" +
            "    0.0\n" +
            "  )\n" +
            "\n" +
            "  (defcap TRANSFER_XCHAIN_RECD:bool\n" +
            "    ( sender:string\n" +
            "      receiver:string\n" +
            "      amount:decimal\n" +
            "      source-chain:string\n" +
            "    )\n" +
            "    @event true\n" +
            "  )\n" +
            "\n" +
            "  ; v3 capabilities\n" +
            "  (defcap RELEASE_ALLOCATION\n" +
            "    ( account:string\n" +
            "      amount:decimal\n" +
            "    )\n" +
            "    @doc \"Event for allocation release, can be used for sig scoping.\"\n" +
            "    @event true\n" +
            "  )\n" +
            "\n" +
            "  ; --------------------------------------------------------------------------\n" +
            "  ; Constants\n" +
            "\n" +
            "  (defconst COIN_CHARSET CHARSET_LATIN1\n" +
            "    \"The default coin contract character set\")\n" +
            "\n" +
            "  (defconst MINIMUM_PRECISION 12\n" +
            "    \"Minimum allowed precision for coin transactions\")\n" +
            "\n" +
            "  (defconst MINIMUM_ACCOUNT_LENGTH 3\n" +
            "    \"Minimum account length admissible for coin accounts\")\n" +
            "\n" +
            "  (defconst MAXIMUM_ACCOUNT_LENGTH 256\n" +
            "    \"Maximum account name length admissible for coin accounts\")\n" +
            "\n" +
            "  (defconst VALID_CHAIN_IDS (map (int-to-str 10) (enumerate 0 19))\n" +
            "    \"List of all valid Chainweb chain ids\")\n" +
            "\n" +
            "  ; --------------------------------------------------------------------------\n" +
            "  ; Utilities\n" +
            "\n" +
            "  (defun enforce-unit:bool (amount:decimal)\n" +
            "    @doc \"Enforce minimum precision allowed for coin transactions\"\n" +
            "\n" +
            "    (enforce\n" +
            "      (= (floor amount MINIMUM_PRECISION)\n" +
            "         amount)\n" +
            "      (format \"Amount violates minimum precision: {}\" [amount]))\n" +
            "    )\n" +
            "\n" +
            "  (defun validate-account (account:string)\n" +
            "    @doc \"Enforce that an account name conforms to the coin contract \\\n" +
            "         \\minimum and maximum length requirements, as well as the    \\\n" +
            "         \\latin-1 character set.\"\n" +
            "\n" +
            "    (enforce\n" +
            "      (is-charset COIN_CHARSET account)\n" +
            "      (format\n" +
            "        \"Account does not conform to the coin contract charset: {}\"\n" +
            "        [account]))\n" +
            "\n" +
            "    (let ((account-length (length account)))\n" +
            "\n" +
            "      (enforce\n" +
            "        (>= account-length MINIMUM_ACCOUNT_LENGTH)\n" +
            "        (format\n" +
            "          \"Account name does not conform to the min length requirement: {}\"\n" +
            "          [account]))\n" +
            "\n" +
            "      (enforce\n" +
            "        (<= account-length MAXIMUM_ACCOUNT_LENGTH)\n" +
            "        (format\n" +
            "          \"Account name does not conform to the max length requirement: {}\"\n" +
            "          [account]))\n" +
            "      )\n" +
            "  )\n" +
            "\n" +
            "  ; --------------------------------------------------------------------------\n" +
            "  ; Coin Contract\n" +
            "\n" +
            "  (defun gas-only ()\n" +
            "    \"Predicate for gas-only user guards.\"\n" +
            "    (require-capability (GAS)))\n" +
            "\n" +
            "  (defun gas-guard (guard:guard)\n" +
            "    \"Predicate for gas + single key user guards\"\n" +
            "    (enforce-one\n" +
            "      \"Enforce either the presence of a GAS cap or keyset\"\n" +
            "      [ (gas-only)\n" +
            "        (enforce-guard guard)\n" +
            "      ]))\n" +
            "\n" +
            "  (defun buy-gas:string (sender:string total:decimal)\n" +
            "    @doc \"This function describes the main 'gas buy' operation. At this point \\\n" +
            "    \\MINER has been chosen from the pool, and will be validated. The SENDER   \\\n" +
            "    \\of this transaction has specified a gas limit LIMIT (maximum gas) for    \\\n" +
            "    \\the transaction, and the price is the spot price of gas at that time.    \\\n" +
            "    \\The gas buy will be executed prior to executing SENDER's code.\"\n" +
            "\n" +
            "    @model [ (property (> total 0.0))\n" +
            "             (property (valid-account sender))\n" +
            "           ]\n" +
            "\n" +
            "    (validate-account sender)\n" +
            "\n" +
            "    (enforce-unit total)\n" +
            "    (enforce (> total 0.0) \"gas supply must be a positive quantity\")\n" +
            "\n" +
            "    (require-capability (GAS))\n" +
            "    (with-capability (DEBIT sender)\n" +
            "      (debit sender total))\n" +
            "    )\n" +
            "\n" +
            "  (defun redeem-gas:string (miner:string miner-guard:guard sender:string total:decimal)\n" +
            "    @doc \"This function describes the main 'redeem gas' operation. At this    \\\n" +
            "    \\point, the SENDER's transaction has been executed, and the gas that      \\\n" +
            "    \\was charged has been calculated. MINER will be credited the gas cost,    \\\n" +
            "    \\and SENDER will receive the remainder up to the limit\"\n" +
            "\n" +
            "    @model [ (property (> total 0.0))\n" +
            "             (property (valid-account sender))\n" +
            "             (property (valid-account miner))\n" +
            "           ]\n" +
            "\n" +
            "    (validate-account sender)\n" +
            "    (validate-account miner)\n" +
            "    (enforce-unit total)\n" +
            "\n" +
            "    (require-capability (GAS))\n" +
            "    (let*\n" +
            "      ((fee (read-decimal \"fee\"))\n" +
            "       (refund (- total fee)))\n" +
            "\n" +
            "      (enforce-unit fee)\n" +
            "      (enforce (>= fee 0.0)\n" +
            "        \"fee must be a non-negative quantity\")\n" +
            "\n" +
            "      (enforce (>= refund 0.0)\n" +
            "        \"refund must be a non-negative quantity\")\n" +
            "\n" +
            "      (emit-event (TRANSFER sender miner fee)) ;v3\n" +
            "\n" +
            "        ; directly update instead of credit\n" +
            "      (with-capability (CREDIT sender)\n" +
            "        (if (> refund 0.0)\n" +
            "          (with-read coin-table sender\n" +
            "            { \"balance\" := balance }\n" +
            "            (update coin-table sender\n" +
            "              { \"balance\": (+ balance refund) }))\n" +
            "\n" +
            "          \"noop\"))\n" +
            "\n" +
            "      (with-capability (CREDIT miner)\n" +
            "        (if (> fee 0.0)\n" +
            "          (credit miner miner-guard fee)\n" +
            "          \"noop\"))\n" +
            "      )\n" +
            "\n" +
            "    )\n" +
            "\n" +
            "  (defun create-account:string (account:string guard:guard)\n" +
            "    @model [ (property (valid-account account)) ]\n" +
            "\n" +
            "    (validate-account account)\n" +
            "    (enforce-reserved account guard)\n" +
            "\n" +
            "    (insert coin-table account\n" +
            "      { \"balance\" : 0.0\n" +
            "      , \"guard\"   : guard\n" +
            "      })\n" +
            "    )\n" +
            "\n" +
            "  (defun get-balance:decimal (account:string)\n" +
            "    (with-read coin-table account\n" +
            "      { \"balance\" := balance }\n" +
            "      balance\n" +
            "      )\n" +
            "    )\n" +
            "\n" +
            "  (defun details:object{fungible-v2.account-details}\n" +
            "    ( account:string )\n" +
            "    (with-read coin-table account\n" +
            "      { \"balance\" := bal\n" +
            "      , \"guard\" := g }\n" +
            "      { \"account\" : account\n" +
            "      , \"balance\" : bal\n" +
            "      , \"guard\": g })\n" +
            "    )\n" +
            "\n" +
            "  (defun rotate:string (account:string new-guard:guard)\n" +
            "    (with-capability (ROTATE account)\n" +
            "      (with-read coin-table account\n" +
            "        { \"guard\" := old-guard }\n" +
            "\n" +
            "        (enforce-guard old-guard)\n" +
            "\n" +
            "        (update coin-table account\n" +
            "          { \"guard\" : new-guard }\n" +
            "          )))\n" +
            "    )\n" +
            "\n" +
            "\n" +
            "  (defun precision:integer\n" +
            "    ()\n" +
            "    MINIMUM_PRECISION)\n" +
            "\n" +
            "  (defun transfer:string (sender:string receiver:string amount:decimal)\n" +
            "    @model [ (property conserves-mass)\n" +
            "             (property (> amount 0.0))\n" +
            "             (property (valid-account sender))\n" +
            "             (property (valid-account receiver))\n" +
            "             (property (!= sender receiver)) ]\n" +
            "\n" +
            "    (enforce (!= sender receiver)\n" +
            "      \"sender cannot be the receiver of a transfer\")\n" +
            "\n" +
            "    (validate-account sender)\n" +
            "    (validate-account receiver)\n" +
            "\n" +
            "    (enforce (> amount 0.0)\n" +
            "      \"transfer amount must be positive\")\n" +
            "\n" +
            "    (enforce-unit amount)\n" +
            "\n" +
            "    (with-capability (TRANSFER sender receiver amount)\n" +
            "      (debit sender amount)\n" +
            "      (with-read coin-table receiver\n" +
            "        { \"guard\" := g }\n" +
            "\n" +
            "        (credit receiver g amount))\n" +
            "      )\n" +
            "    )\n" +
            "\n" +
            "  (defun transfer-create:string\n" +
            "    ( sender:string\n" +
            "      receiver:string\n" +
            "      receiver-guard:guard\n" +
            "      amount:decimal )\n" +
            "\n" +
            "    @model [ (property conserves-mass) ]\n" +
            "\n" +
            "    (enforce (!= sender receiver)\n" +
            "      \"sender cannot be the receiver of a transfer\")\n" +
            "\n" +
            "    (validate-account sender)\n" +
            "    (validate-account receiver)\n" +
            "\n" +
            "    (enforce (> amount 0.0)\n" +
            "      \"transfer amount must be positive\")\n" +
            "\n" +
            "    (enforce-unit amount)\n" +
            "\n" +
            "    (with-capability (TRANSFER sender receiver amount)\n" +
            "      (debit sender amount)\n" +
            "      (credit receiver receiver-guard amount))\n" +
            "    )\n" +
            "\n" +
            "  (defun coinbase:string (account:string account-guard:guard amount:decimal)\n" +
            "    @doc \"Internal function for the initial creation of coins.  This function \\\n" +
            "    \\cannot be used outside of the coin contract.\"\n" +
            "\n" +
            "    @model [ (property (valid-account account))\n" +
            "             (property (> amount 0.0))\n" +
            "           ]\n" +
            "\n" +
            "    (validate-account account)\n" +
            "    (enforce-unit amount)\n" +
            "\n" +
            "    (require-capability (COINBASE))\n" +
            "    (emit-event (TRANSFER \"\" account amount)) ;v3\n" +
            "    (with-capability (CREDIT account)\n" +
            "      (credit account account-guard amount))\n" +
            "    )\n" +
            "\n" +
            "  (defun remediate:string (account:string amount:decimal)\n" +
            "    @doc \"Allows for remediation transactions. This function \\\n" +
            "         \\is protected by the REMEDIATE capability\"\n" +
            "    @model [ (property (valid-account account))\n" +
            "             (property (> amount 0.0))\n" +
            "           ]\n" +
            "\n" +
            "    (validate-account account)\n" +
            "\n" +
            "    (enforce (> amount 0.0)\n" +
            "      \"Remediation amount must be positive\")\n" +
            "\n" +
            "    (enforce-unit amount)\n" +
            "\n" +
            "    (require-capability (REMEDIATE))\n" +
            "    (emit-event (TRANSFER \"\" account amount)) ;v3\n" +
            "    (with-read coin-table account\n" +
            "      { \"balance\" := balance }\n" +
            "\n" +
            "      (enforce (<= amount balance) \"Insufficient funds\")\n" +
            "\n" +
            "      (update coin-table account\n" +
            "        { \"balance\" : (- balance amount) }\n" +
            "        ))\n" +
            "    )\n" +
            "\n" +
            "  (defpact fund-tx (sender:string miner:string miner-guard:guard total:decimal)\n" +
            "    @doc \"'fund-tx' is a special pact to fund a transaction in two steps,     \\\n" +
            "    \\with the actual transaction transpiring in the middle:                   \\\n" +
            "    \\                                                                         \\\n" +
            "    \\  1) A buying phase, debiting the sender for total gas and fee, yielding \\\n" +
            "    \\     TX_MAX_CHARGE.                                                      \\\n" +
            "    \\  2) A settlement phase, resuming TX_MAX_CHARGE, and allocating to the   \\\n" +
            "    \\     coinbase account for used gas and fee, and sender account for bal-  \\\n" +
            "    \\     ance (unused gas, if any).\"\n" +
            "\n" +
            "    @model [ (property (> total 0.0))\n" +
            "             (property (valid-account sender))\n" +
            "             (property (valid-account miner))\n" +
            "             ;(property conserves-mass) not supported yet\n" +
            "           ]\n" +
            "\n" +
            "    (step (buy-gas sender total))\n" +
            "    (step (redeem-gas miner miner-guard sender total))\n" +
            "    )\n" +
            "\n" +
            "  (defun debit:string (account:string amount:decimal)\n" +
            "    @doc \"Debit AMOUNT from ACCOUNT balance\"\n" +
            "\n" +
            "    @model [ (property (> amount 0.0))\n" +
            "             (property (valid-account account))\n" +
            "           ]\n" +
            "\n" +
            "    (validate-account account)\n" +
            "\n" +
            "    (enforce (> amount 0.0)\n" +
            "      \"debit amount must be positive\")\n" +
            "\n" +
            "    (enforce-unit amount)\n" +
            "\n" +
            "    (require-capability (DEBIT account))\n" +
            "    (with-read coin-table account\n" +
            "      { \"balance\" := balance }\n" +
            "\n" +
            "      (enforce (<= amount balance) \"Insufficient funds\")\n" +
            "\n" +
            "      (update coin-table account\n" +
            "        { \"balance\" : (- balance amount) }\n" +
            "        ))\n" +
            "    )\n" +
            "\n" +
            "\n" +
            "  (defun credit:string (account:string guard:guard amount:decimal)\n" +
            "    @doc \"Credit AMOUNT to ACCOUNT balance\"\n" +
            "\n" +
            "    @model [ (property (> amount 0.0))\n" +
            "             (property (valid-account account))\n" +
            "           ]\n" +
            "\n" +
            "    (validate-account account)\n" +
            "\n" +
            "    (enforce (> amount 0.0) \"credit amount must be positive\")\n" +
            "    (enforce-unit amount)\n" +
            "\n" +
            "    (require-capability (CREDIT account))\n" +
            "    (with-default-read coin-table account\n" +
            "      { \"balance\" : -1.0, \"guard\" : guard }\n" +
            "      { \"balance\" := balance, \"guard\" := retg }\n" +
            "      ; we don't want to overwrite an existing guard with the user-supplied one\n" +
            "      (enforce (= retg guard)\n" +
            "        \"account guards do not match\")\n" +
            "\n" +
            "      (let ((is-new\n" +
            "             (if (= balance -1.0)\n" +
            "                 (enforce-reserved account guard)\n" +
            "               false)))\n" +
            "\n" +
            "        (write coin-table account\n" +
            "          { \"balance\" : (if is-new amount (+ balance amount))\n" +
            "          , \"guard\"   : retg\n" +
            "          }))\n" +
            "      ))\n" +
            "\n" +
            "  (defun check-reserved:string (account:string)\n" +
            "    \" Checks ACCOUNT for reserved name and returns type if \\\n" +
            "    \\ found or empty string. Reserved names start with a \\\n" +
            "    \\ single char and colon, e.g. 'c:foo', which would return 'c' as type.\"\n" +
            "    (let ((pfx (take 2 account)))\n" +
            "      (if (= \":\" (take -1 pfx)) (take 1 pfx) \"\")))\n" +
            "\n" +
            "  (defun enforce-reserved:bool (account:string guard:guard)\n" +
            "    @doc \"Enforce reserved account name protocols.\"\n" +
            "    (if (validate-principal guard account)\n" +
            "      true\n" +
            "      (let ((r (check-reserved account)))\n" +
            "        (if (= r \"\")\n" +
            "          true\n" +
            "          (if (= r \"k\")\n" +
            "            (enforce false \"Single-key account protocol violation\")\n" +
            "            (enforce false\n" +
            "              (format \"Reserved protocol guard violation: {}\" [r]))\n" +
            "            )))))\n" +
            "\n" +
            "\n" +
            "  (defschema crosschain-schema\n" +
            "    @doc \"Schema for yielded value in cross-chain transfers\"\n" +
            "    receiver:string\n" +
            "    receiver-guard:guard\n" +
            "    amount:decimal\n" +
            "    source-chain:string)\n" +
            "\n" +
            "  (defpact transfer-crosschain:string\n" +
            "    ( sender:string\n" +
            "      receiver:string\n" +
            "      receiver-guard:guard\n" +
            "      target-chain:string\n" +
            "      amount:decimal )\n" +
            "\n" +
            "    @model [ (property (> amount 0.0))\n" +
            "             (property (valid-account sender))\n" +
            "             (property (valid-account receiver))\n" +
            "           ]\n" +
            "\n" +
            "    (step\n" +
            "      (with-capability\n" +
            "        (TRANSFER_XCHAIN sender receiver amount target-chain)\n" +
            "\n" +
            "        (validate-account sender)\n" +
            "        (validate-account receiver)\n" +
            "\n" +
            "        (enforce (!= \"\" target-chain) \"empty target-chain\")\n" +
            "        (enforce (!= (at 'chain-id (chain-data)) target-chain)\n" +
            "          \"cannot run cross-chain transfers to the same chain\")\n" +
            "\n" +
            "        (enforce (> amount 0.0)\n" +
            "          \"transfer quantity must be positive\")\n" +
            "\n" +
            "        (enforce-unit amount)\n" +
            "\n" +
            "        (enforce (contains target-chain VALID_CHAIN_IDS)\n" +
            "          \"target chain is not a valid chainweb chain id\")\n" +
            "\n" +
            "        ;; step 1 - debit delete-account on current chain\n" +
            "        (debit sender amount)\n" +
            "        (emit-event (TRANSFER sender \"\" amount))\n" +
            "\n" +
            "        (let\n" +
            "          ((crosschain-details:object{crosschain-schema}\n" +
            "            { \"receiver\" : receiver\n" +
            "            , \"receiver-guard\" : receiver-guard\n" +
            "            , \"amount\" : amount\n" +
            "            , \"source-chain\" : (at 'chain-id (chain-data))\n" +
            "            }))\n" +
            "          (yield crosschain-details target-chain)\n" +
            "          )))\n" +
            "\n" +
            "    (step\n" +
            "      (resume\n" +
            "        { \"receiver\" := receiver\n" +
            "        , \"receiver-guard\" := receiver-guard\n" +
            "        , \"amount\" := amount\n" +
            "        , \"source-chain\" := source-chain\n" +
            "        }\n" +
            "\n" +
            "        (emit-event (TRANSFER \"\" receiver amount))\n" +
            "        (emit-event (TRANSFER_XCHAIN_RECD \"\" receiver amount source-chain))\n" +
            "\n" +
            "        ;; step 2 - credit create account on target chain\n" +
            "        (with-capability (CREDIT receiver)\n" +
            "          (credit receiver receiver-guard amount))\n" +
            "        ))\n" +
            "    )\n" +
            "\n" +
            "\n" +
            "  ; --------------------------------------------------------------------------\n" +
            "  ; Coin allocations\n" +
            "\n" +
            "  (defschema allocation-schema\n" +
            "    @doc \"Genesis allocation registry\"\n" +
            "    ;@model [ (invariant (>= balance 0.0)) ]\n" +
            "\n" +
            "    balance:decimal\n" +
            "    date:time\n" +
            "    guard:guard\n" +
            "    redeemed:bool)\n" +
            "\n" +
            "  (deftable allocation-table:{allocation-schema})\n" +
            "\n" +
            "  (defun create-allocation-account\n" +
            "    ( account:string\n" +
            "      date:time\n" +
            "      keyset-ref:string\n" +
            "      amount:decimal\n" +
            "    )\n" +
            "\n" +
            "    @doc \"Add an entry to the coin allocation table. This function \\\n" +
            "         \\also creates a corresponding empty coin contract account \\\n" +
            "         \\of the same name and guard. Requires GENESIS capability. \"\n" +
            "\n" +
            "    @model [ (property (valid-account account)) ]\n" +
            "\n" +
            "    (require-capability (GENESIS))\n" +
            "\n" +
            "    (validate-account account)\n" +
            "    (enforce (>= amount 0.0)\n" +
            "      \"allocation amount must be non-negative\")\n" +
            "\n" +
            "    (enforce-unit amount)\n" +
            "\n" +
            "    (let\n" +
            "      ((guard:guard (keyset-ref-guard keyset-ref)))\n" +
            "\n" +
            "      (create-account account guard)\n" +
            "\n" +
            "      (insert allocation-table account\n" +
            "        { \"balance\" : amount\n" +
            "        , \"date\" : date\n" +
            "        , \"guard\" : guard\n" +
            "        , \"redeemed\" : false\n" +
            "        })))\n" +
            "\n" +
            "  (defun release-allocation\n" +
            "    ( account:string )\n" +
            "\n" +
            "    @doc \"Release funds associated with allocation ACCOUNT into main ledger.   \\\n" +
            "         \\ACCOUNT must already exist in main ledger. Allocation is deactivated \\\n" +
            "         \\after release.\"\n" +
            "    @model [ (property (valid-account account)) ]\n" +
            "\n" +
            "    (validate-account account)\n" +
            "\n" +
            "    (with-read allocation-table account\n" +
            "      { \"balance\" := balance\n" +
            "      , \"date\" := release-time\n" +
            "      , \"redeemed\" := redeemed\n" +
            "      , \"guard\" := guard\n" +
            "      }\n" +
            "\n" +
            "      (let ((curr-time:time (at 'block-time (chain-data))))\n" +
            "\n" +
            "        (enforce (not redeemed)\n" +
            "          \"allocation funds have already been redeemed\")\n" +
            "\n" +
            "        (enforce\n" +
            "          (>= curr-time release-time)\n" +
            "          (format \"funds locked until {}. current time: {}\" [release-time curr-time]))\n" +
            "\n" +
            "        (with-capability (RELEASE_ALLOCATION account balance)\n" +
            "\n" +
            "        (enforce-guard guard)\n" +
            "\n" +
            "        (with-capability (CREDIT account)\n" +
            "          (emit-event (TRANSFER \"\" account balance))\n" +
            "          (credit account guard balance)\n" +
            "\n" +
            "          (update allocation-table account\n" +
            "            { \"redeemed\" : true\n" +
            "            , \"balance\" : 0.0\n" +
            "            })\n" +
            "\n" +
            "          \"Allocation successfully released to main ledger\"))\n" +
            "    )))\n" +
            "\n" +
            ")"
