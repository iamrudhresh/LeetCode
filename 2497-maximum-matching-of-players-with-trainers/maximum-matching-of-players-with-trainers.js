const matchPlayersAndTrainers = (p, t) => {
    p.sort((a, b) => a - b);
    t.sort((a, b) => a - b);
    let i = 0, j = 0, c = 0;
    while (i < p.length && j < t.length) c += p[i] <= t[j++] ? ++i && 1 : 0;
    return c;
    
};